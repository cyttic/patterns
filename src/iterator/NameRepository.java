package iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        System.out.println("THERE IS ITERATOR CREATION!!");
        return new NameIterator(this);
    }

    @Override
    public Object[] getRepository() {
        return names;
    }

}
