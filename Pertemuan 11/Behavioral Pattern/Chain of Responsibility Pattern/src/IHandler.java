public interface IHandler {
    void setNext(IHandler handler);
    void handleRequest(String request);
}