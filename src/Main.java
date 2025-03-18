public class Main{
    public static void main(String[] args) throws Exception {
        HandleOrders handleOrders = new HandleOrders();
        handleOrders.takeOrder();
        handleOrders.createOrderSummary();
        System.out.println(handleOrders);
        OrderLogs orderLogs = new OrderLogs();
        orderLogs.addOrderLog("Order 1: Pepperoni Pizza");
        orderLogs.addOrderLog("Order 2: Veggie Pizza");
        orderLogs.handleLogs();
    }
}
