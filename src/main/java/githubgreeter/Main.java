package githubgreeter;

public class Main{
  public static void main(String[] args) {
    // Instantiate a GitHubGreeter object
    GitHubGreeter greeter = new GitHubGreeter();

    // Call the methods you wrote and confirm the correct format
    System.out.println(greeter.welcome("James"));
    System.out.println(greeter.wishes());
  }
}
