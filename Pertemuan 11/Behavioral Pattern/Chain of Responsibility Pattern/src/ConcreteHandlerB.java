public class ConcreteHandlerB implements IHandler {
    private IHandler nextHandler;

    @Override
    public void setNext(IHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.contains("B")) {
            System.out.println("ConcreteHandlerB menangani permintaan: " + request);
        } else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Permintaan tidak dapat ditangani: " + request);
        }
    }
}