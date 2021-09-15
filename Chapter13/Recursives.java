import java.util.ArrayList;
import java.util.List;

public class Recursives {

        private static ArrayList<Integer> factors(int f) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 2; i < f; i++) {
                        if (f % i == 0) {
                                list.add(i);
                                factors(f / i, list);
                                return list;
                        }
                }
                list.add(f);
                return list;
        }

        private static void factors(int f, ArrayList<Integer> l) {

                for (int i = 2; i < f; i++) {
                        if (f % i == 0) {
                                l.add(i);
                                factors(f / i, l);
                                return;
                        }
                }
                l.add(f);
        }

        private static String toBinary(int n) {
                int a;
                if (n > 0) {
                        a = n % 2;
                        return (toBinary(n / 2) + "" + a);
                }
                return "";
        }

        public static String reverse(String s) {
                if (s.isEmpty())
                        return s;
                return reverse(s.substring(1)) + s.charAt(0);
        }

        public static double polygon(ArrayList<Double> p)

        {
                List<Double> x = new ArrayList<>();
                List<Double> y = new ArrayList<>();
                
                for(int i=0;i<p.size();i++)
                {
                        if(i%2==0)
                        {
                                x.add(p.get(i));
                        }
                        else
                        {
                                y.add(p.get(i));
                        }
                }
                
                double area = 0.0;
                int n = x.size();
                int j = n - 1;
                for (int i = 0; i < n; i++)
                {
                        area += (x.get(j) + x.get(i)) * (y.get(j) - y.get(i));
                        j = i;
                }
                return Math.abs(area / 2.0);
        }

        public static void main(String[] args) {
                
                
                System.out.println("Recursives - ");

                System.out.println("Factors:"); // E13.3 
                System.out.printf(" %7d: %s%n", 85, factors (85));

                System.out.printf(" %7d: %s%n", 105, factors(105)); 
                System.out.printf(" %7d: %s%n%n", 3783780, factors (3783780));

                System.out.println("Binary:"); // E13.4 
                System.out.printf(" %7d: %s%n", 24, toBinary(24));

                System.out.printf(" %7d: %s%n", 105, toBinary(105));

                System.out.printf(" %7d: %s%n", 3783780, toBinary(3783780));

                System.out.println("Reverse:"); // E13.5 
                System.out.printf(" %s: %s%n", "Hello!", reverse("Hello!"));

                System.out.printf(" %s: %s%n", "Madam, I'm Adam", reverse("Madam, I'm Adam"));

                System.out.printf(" %s: %s%n","amanaplanacanalpanama", reverse("amanaplanacanalpanama")); 
                System.out.printf(" %s: %s%n%n", "This is a test of Double Reverse!!",

                reverse(reverse("This is a test of Double Reverse!!")));



                System.out.println("Polygon:"); // E13.12 
                ArrayList<Double> points = new ArrayList<Double>();

                points.add(1.0);

                points.add(3.0); 
                points.add(1.0);

                points.add(7.0);

                points.add(3.0); 
                points.add(9.0);

                points.add(8.0); 
                points.add(8.0);

                points.add(9.0);

                points.add(4.0);

                points.add(8.0);

                points.add(1.0); 
                points.add(4.0);

                points.add(1.0);

                System.out.printf(" %f%n", polygon(points));

        }
}
