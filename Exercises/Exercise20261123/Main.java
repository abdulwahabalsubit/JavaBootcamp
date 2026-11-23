//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*
* 1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86
*/
    Scanner input = new Scanner(System.in);
    int weight ;
    double height;
    double bmi;

    System.out.println("Enter your Weight (in kilograms)");
    weight = input.nextInt();

    System.out.println("Enter your Height (in meters)");
    height = input.nextDouble();

    bmi = weight / (height * 2) ;
    System.out.println("your BMI is: " + bmi);
    System.out.println("\n=============================");

/*
2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0%
 */

    int obtained ;
    int total;
    double percentage;

    System.out.println("Enter your obtained");
    obtained = input.nextInt();

    System.out.println("Enter your total");
    total = input.nextInt();

    percentage = (obtained * total) / 100 ;
    System.out.println("your Percentage is: " + percentage + "%");
    System.out.println("\n=============================");
/*
3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0
 */
    double amount ;
    double exchangeRate;
    double convert;

    System.out.println("Enter your amount USD");
    amount = input.nextDouble();

    System.out.println("Enter Exchange Rate (USD to EUR)");
    exchangeRate = input.nextDouble();

    convert = (amount * exchangeRate)  ;
    System.out.println("Amount in EUR = " + convert );
    System.out.println("\n=============================");
/*
4. Create a program that takes a string as input, calculates its length,
    and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"
 */
    String reverseText ;

    System.out.println("Enter your text");
    reverseText = input.nextLine();
    reverseText = input.nextLine();

    StringBuilder sb = new StringBuilder(reverseText);
    System.out.println("Length of the string: " + reverseText.length() + " And Reversed string: \"" + sb.reverse() + "\"");
    System.out.println("\n=============================");

    /*
    5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
• Expected Output: "brown fox"
     */
    String sentence ;
    System.out.println("Enter your sentence");
    sentence = input.nextLine();
    System.out.println("Output: " + sentence.substring(10,20));
    System.out.println("\n=============================");
/*
6. Write a program that takes a sentence and a keyword as input,
   then check if the keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
• Expected Output: Keyword "jumps" is present in the sentence.
 */
    String sentence2;
    String keyword;
    boolean result;

    System.out.println("Enter your sentence2");
    sentence2 = input.nextLine();
    System.out.println("Enter your keyword");
    keyword = input.nextLine();
    result = sentence2.contains(keyword) ;
    System.out.println(" Keyword \"" + keyword + "\" is present in the sentence.");
    System.out.println("\n=============================");

    /*
    7. Develop a program that takes a sentence and a word to replace as input,
    then replace all occurrences of the word with another word and prints the modified sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog",
Word to Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"
     */
    String sentence3;
    String word;
    String wordRelacement;
    System.out.println("Enter your Sentence3");
    sentence3 = input.nextLine();
    System.out.println("Enter your word to replace");
    word = input.nextLine();
    System.out.println("Enter your word to replace with");
    wordRelacement = input.nextLine();

    System.out.println("Output: " + sentence3.replace(word,wordRelacement));
    System.out.println("\n=============================");
    /*
    8. Write a program that takes two strings as input and check if they are equal,ignoring the case,
    then prints whether they are equal or not.
• Input:  String1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case).
     */

    String text1;
    String text2;
    boolean result2;
    System.out.println("Enter your text1");
    text1 = input.nextLine();
    System.out.println("Enter your text2");
    text2 = input.nextLine();

    result2 = text1.equalsIgnoreCase(text2);
    System.out.println(" Strings are equal (ignoring case): " + result2);
    System.out.println("\n=============================");





}
