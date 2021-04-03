package timesheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private List<String> employeeNames = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectsFile){
        readEmployees(employeesFile);
        readProjects(projectsFile);
    }

    public void readEmployees(InputStream employeesFile) {
        try (BufferedReader employeeReader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = employeeReader.readLine())  != null) {
                String[] parts = line.split(" ");
                employees.add(new Employee(parts[0], parts[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void readProjects(InputStream projectsFile) {
        try (BufferedReader projectReader = new BufferedReader(new InputStreamReader(projectsFile))){
            String line;
            while ((line = projectReader.readLine())  != null) {
                projects.add(new Project(line));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<String> createEmployeeNames(){
        for (Employee employee : employees){
            employeeNames.add(employee.getName());
        }
        return employeeNames;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate){
        timeSheetItems.add(new TimeSheetItem(employee, project,beginDate,endDate));
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String name, int year, int month) {
        createEmployeeNames();
        if (!employeeNames.contains(name)){
            throw new IllegalArgumentException("Invalid name!");
        }
        List<ReportLine> reportLines = getReportLines();
        List<TimeSheetItem> selectedTimeSheetItems = getSelectedTimeSheetItems(name, year, month);

        for (ReportLine reportLine : reportLines) {
            for (TimeSheetItem item : selectedTimeSheetItems){
                if (item.getProject().getName().equals(reportLine.getProject().getName())) {
                    reportLine.addTime(item.hoursBetweenDates());
                }
            }
        }
        return reportLines;
    }

    public List<TimeSheetItem> getSelectedTimeSheetItems(String name, int year, int month) {
        List<TimeSheetItem> selectedTimeSheetItems =  new ArrayList<>();
        for (TimeSheetItem timeSheetItem : timeSheetItems) {
            if (timeSheetItem.getEmployee().getName().equals(name) &&
                    timeSheetItem.getBeginDate().getYear() == year && timeSheetItem.getBeginDate().getMonthValue() == month) {
                selectedTimeSheetItems.add(timeSheetItem);
            }
        }
        return selectedTimeSheetItems;
    }

    public List<ReportLine> getReportLines() {
        List<ReportLine> reportLines = new ArrayList<>();
        for (Project project : projects){
            reportLines.add(new ReportLine(project, 0L));
        }
        return reportLines;
    }

    public void printToFile(String name, int year, int month, Path report) throws IOException {

        String monthSt = "";
        Long totalHours = 0L;

        List<ReportLine> reportLines = calculateProjectByNameYearMonth(name, year, month);
        if (month < 10){
            monthSt = "0" + Integer.toString(month);
        }

        StringBuilder sb = createHeadline(name, year, monthSt, totalHours, reportLines);

        for (ReportLine reportLine : reportLines) {
            if (reportLine.getTime() != 0) {
                sb.append(reportLine.getProject().getName() + "\t" + reportLine.getTime() + "\n");
            }
            Files.writeString(report, sb.toString());
        }
    }

    public StringBuilder createHeadline(String name, int year, String monthSt, Long totalHours, List<ReportLine> reportLines) {
        for (ReportLine reportLine : reportLines) {
            totalHours = totalHours + reportLine.getTime();
        }
        StringBuilder sb = new StringBuilder();
        String headLine = name + "\t" + Integer.toString(year) + "-" + monthSt + "\t" + Long.toString(totalHours) + "\n";
        sb.append(headLine);
        return sb;
    }
}


