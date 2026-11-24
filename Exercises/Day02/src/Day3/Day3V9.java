void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("enter three number to check which one is the large number between them!!");
    System.out.println("enter the f number: ");
    int f = input.nextInt();
    System.out.println("enter the s number: ");
    int s = input.nextInt();
    System.out.println("enter the t number: ");
    int t = input.nextInt();
    if ((f > s && f != s) && (f > t && f != t)) {
        System.out.println("f: " + f);
    } else if
    ((s > f && s != f) && (s > t && s != t)) {
        System.out.println("s: " + s);
    }
    else if
    ((t > f && t != f) && (t > s && f != s)) {
        System.out.println("t: " + t);
    }
    else
        System.out.println(" all number is equal" );
}
