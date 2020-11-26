package workingWithString;

public class main {
    public static void main(String[] args) {
        String space = "there is   3spaces, there is  2.    4spaces right here.now there is     5 spaces";
        System.out.println(MostOfSpaceBetweenWords.spaceWithoutRegex(space)); //task1

//        String aAndB = "there is some a letters, that should contain b letter, after letter a";
//        System.out.println(BAfterLetterA.addLetterBWithoutRegex(aAndB)); //task2

//        String palindrome = "momom";
//        System.out.println(isPalindrome.palindrome(palindrome)); //task3

//        System.out.println(Cake.cake()); //task4

//        String letA = "I'm actually don't know how much letters a, gonna contain that string.";
//        System.out.println(LetterAFrequency.frequency(letA)); //task5

//        String repeat = "repeateach symbol 2 times.";
//        System.out.println(RepeatSymbol2Times.repeat(repeat)); //task6

//        String unique = "arojawiej23oitj0wr  rqewjao jr2 3453 192jr";
//        System.out.println(UniqueSymbolsWithoutSpace.unique(unique));//task7

        String longestWord = "abc";
        System.out.println(LongestWord.longestOneWithoutRegex(longestWord)); //task 8

//        String amountOfLetters = "That Was Not Hard, RIGHT? maybe...";
//        System.out.println(LettersCount.counter(amountOfLetters)); //task 9

//        String clause = "Okay. I did it! or do that? or whatever. im done!";
//        System.out.println(AmountOfClause.amountWithoutString(clause));
    }
}
