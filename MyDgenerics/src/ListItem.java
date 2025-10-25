public class ListItem <Item>{
    private Item data;
    private ListItem<Item> next;
    private ListItem<Item> prev;
    ListItem(Item data) {
        this.data = data;
        next = null;
        prev = null;
    }

    ListItem(Item data, ListItem<Item> p) {
        this.data = data;
        prev = p;
    }
    public Item getData() {
        return data;
    }
    public void setData(Item d) {
        data = d;
    }
    public ListItem<Item> getPrev() {
        return prev;
    }
    public ListItem<Item> getNext() {
        return next;
    }
    public void setPrev(ListItem<Item> li) {
        prev = li;
    }     public void setNext(ListItem<Item> li) {
        next = li;
    }
}
