public class Function {
    enum Status{
        SUCCESS,
        FIALED,
        RUNNING,
        PENDING;
    }
  
    public static void main(String[] args) {
     Status status = Status.RUNNING;
     //System.out.println(status);
     if (status == Status.SUCCESS) {
        System.out.println("Succsess");
     } else if (status == Status.FIALED) {
        System.out.println("Failed");
     } else if (status == Status.RUNNING) {
        System.out.println("Running");
     } else if (status == Status.PENDING) {
        System.out.println("Pending");
     }
    }
  }