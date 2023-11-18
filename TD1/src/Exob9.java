public class Exob9 {
    public static void main(String[] args){

                for (int i = 100; i < 1000; i++) {
                    int centaine = i / 100;
                    int dizaine = (i / 10) % 10;
                    int unite = i % 10;

                    if (i == (Math.pow(centaine, 3) + Math.pow(dizaine, 3) + Math.pow(unite, 3))) {
                        System.out.println(i);
                    }
                }
            }
        }

