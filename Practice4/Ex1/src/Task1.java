public class Task1 {
    enum Seasons {
        SUMMER(18) {
            public String getDescription() {
                return "Warm season.";
            }
        },
        AUTUMN(3.7), WINTER(-10), SPRING(4.3);
        private double avgTemp;
        Seasons(double temp) {
            this.avgTemp = temp;
        }
        public double getAvgTemp() {
            return this.avgTemp;
        }
        public String getDescription() {
            return "Cold season.";
        }
/*        public String toString(Seasons season) {
            switch (season) {
                case AUTUMN:
                    return "Lasts 3 months: September(30 days), October(31 day), November(30 days).";
                case SPRING:
                    return "Lasts 3 months: March(31 days), April(30 day), May(31 days).";
                case WINTER:
                    return "Lasts 3 months: December(31 days), January(31 day), February(28 or 29 days).";
                case SUMMER:
                    return "Lasts 3 months: June(30 days), July(31 day), August(31 days).";
            }
            return "";
        } */
    };

    static public void out(Seasons seasons) {
        switch (seasons) {
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case WINTER:
                System.out.println("I love winter!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
        }
    }
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s + ": average temperature: " + s.getAvgTemp() + ". " + s.getDescription());
        }
    }
}