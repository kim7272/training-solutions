package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static catalog.SearchCriteria.createByBoth;
import static catalog.SearchCriteria.createByTitle;

 public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int number) {
            double counter = 0.0;
            double result = 0.0;
            if (number == 0) {
                throw new IllegalArgumentException("Page number must be positive");
            }
            for (CatalogItem catalogItem : catalogItems) {
                if (catalogItem.hasPrintedFeature() && catalogItem.numberOfPagesAtOneItem() > number) {
                    result = result + catalogItem.numberOfPagesAtOneItem();
                    counter = counter + 1.0;
                }
                else if (result == 0){
                    throw new IllegalArgumentException("No page");
                }
            }
            return result / counter;
    }

    public void deleteItemByRegistrationNumber(String regNumber){
        CatalogItem foundItem = null;
        for(CatalogItem catalogItem : catalogItems){
            if (catalogItem.getRegistrationNumber() == regNumber){
                foundItem = catalogItem;
            }
        }
        catalogItems.remove(foundItem);
    }

     public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){

        List<CatalogItem> items = new ArrayList<>();

        if (searchCriteria.hasContributor() && searchCriteria.hasTitle()) {
             for (CatalogItem catalogItem : catalogItems) {
                 if ((catalogItem.getContributors().contains(SearchCriteria.getContributor())) && (catalogItem.getTitles().contains(SearchCriteria.getTitle()))) {
                     items.add(catalogItem);
                 }
             }
        }
        else if (searchCriteria.hasContributor()) {
             for (CatalogItem catalogItem : catalogItems){
                  if (catalogItem.getContributors().contains(SearchCriteria.getContributor())){
                     items.add(catalogItem);
                  }
            }
        }
        else {
              for (CatalogItem catalogItem : catalogItems){
                   if (catalogItem.getTitles().contains(SearchCriteria.getTitle())){
                       items.add(catalogItem);
                   }
              }
        }
        return items;
    }

    public int getAllPageNumber(){
        int result = 0;
        for (CatalogItem catalogItem : catalogItems){
            if (catalogItem.hasPrintedFeature()){
                result = result + catalogItem.numberOfPagesAtOneItem();
            }
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        List<CatalogItem> items = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems){
            if (catalogItem.hasAudioFeature()){
                items.add(catalogItem);
            }
        }
        return items;
   }

    public int getFullLength(){
        int result = 0;
        for (CatalogItem catalogItem : catalogItems){
            if (catalogItem.hasAudioFeature()){
                result = result + catalogItem.fullLengthAtOneItem();
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> items = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems){
            if (catalogItem.hasPrintedFeature()){
                items.add(catalogItem);
            }
        }
        return items;
    }
}

