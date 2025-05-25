public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        IHandler handlerA = new ConcreteHandlerA();
        IHandler handlerB = new ConcreteHandlerB();

        handlerA.setNext(handlerB);

        System.out.println("Request: Permintaan tipe A");
        handlerA.handleRequest("Permintaan tipe A");

        System.out.println("Request: Permintaan tipe B");
        handlerA.handleRequest("Permintaan tipe B");

        System.out.println("Request: Permintaan tipe C");
        handlerA.handleRequest("Permintaan tipe C");
    }
}
