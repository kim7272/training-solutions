package week12d02;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Street {

        List<Site> sites = new ArrayList<>();

        private int perfectCounter;
        private int needUpgradeCounter;
        private int noFenceCounter;

        public int getPerfectCounter() {
            return perfectCounter;
        }

        public int getNeedUpgradeCounter() {
            return needUpgradeCounter;
        }

        public int getNoFenceCounter() {
            return noFenceCounter;
        }

        public Street(List<Site> sites) {
            this.sites = sites;
        }

        public void sellSite(Site site) {
            sites.add(site);
        }

        public List<Integer> evenSites() {
            List<Integer> evens = new ArrayList<>();
            int i = 2;
            for (Site site : sites) {
                if (site.getSide() == 0) {
                    evens.add(i);
                    i = i + 2;
                }
            }
            return evens;
        }

        public List<Integer> oddSites() {
            List<Integer> odds = new ArrayList<>();
            int i = 1;
            for (Site site : sites) {
                if (site.getSide() == 1) {
                    odds.add(i);
                    i = i + 2;
                }
            }
            return odds;
        }

        public int lastSold() {
            int result = 0;
            Site lastSite = sites.get(sites.size() - 1);
            if (lastSite.getSide() == 0) {
                result = evenSites().get(evenSites().size() - 1);
            } else if (lastSite.getSide() == 1) {
                result = oddSites().get(oddSites().size() - 1);
            }
            return result;
        }

        public void FenceTypeCounter() {

            for (Site site : sites) {
                if (site.getFence() == Fence.PERFECT) {
                    perfectCounter = perfectCounter + 1;
                } else if (site.getFence() == Fence.NEED_UPGRADE) {
                    needUpgradeCounter = needUpgradeCounter + 1;
                } else {
                    noFenceCounter = noFenceCounter + 1;
                }
            }

        }

        public List<FenceRegister> getNumberByFenceType() {
            List<FenceRegister> fenceTypeNumbers = new ArrayList<>();
            this.FenceTypeCounter();

            fenceTypeNumbers.add(new FenceRegister(Fence.PERFECT, this.getPerfectCounter()));
            fenceTypeNumbers.add(new FenceRegister(Fence.NEED_UPGRADE, this.getNeedUpgradeCounter()));
            fenceTypeNumbers.add(new FenceRegister(Fence.NO_FENCE, this.getNoFenceCounter()));
            return fenceTypeNumbers;
        }

        public static void main(String[] args) {
            List<Site> sites = Arrays.asList(new Site(0,10,Fence.PERFECT),new Site(0,7,Fence.NEED_UPGRADE),new Site(1,12,Fence.NEED_UPGRADE),
            new Site(0,9,Fence.PERFECT),new Site(0,11,Fence.NO_FENCE),new Site(1,13,Fence.PERFECT));

            Street street = new Street(sites);
            street.FenceTypeCounter();

            System.out.println(street.getPerfectCounter());

        }
    }

