package problemSolving.A;

// we use recursion when we have two functions with the same behaviour calling each other, so we make the function call itself.
// Recursive function will call itself until it reach the base case, then it start to empty the stack to get the value of every call
//to itself then finishes.
public class Recusrsion_Technique {

    private static int Fact(int n){
        if(n <= 1){   // Base case (this will prevent the recursive call to continue for infinity)
            return 1;
        }

        //We may have a logic here if we need (problem is complex enough)

        return n * Fact(n - 1); //sub problem to make the bigeer problem small by time
    }

    public static void main(String args[]) {
        System.out.println(Fact(4));
    }
}
