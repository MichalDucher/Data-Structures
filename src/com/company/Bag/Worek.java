package com.company.Bag;
import java.util.Iterator;

public class Worek<Item> implements Iterable<Item> {
    private Wezel pierwszy;
    private class Wezel{
        Item item;
        Wezel nastepny;
    }
    public void dodaj(Item a){
        Wezel popPierwszy = pierwszy;
        pierwszy = new Wezel();
        pierwszy.item = a;
        pierwszy.nastepny = popPierwszy;
    }
    public Iterator<Item> iterator(){ return new LIterator(); }
    public class LIterator implements Iterator<Item>{
        private Wezel biezacy = pierwszy;
        public boolean hasNext(){ return biezacy != null; }
        public Item next(){
            Item item = biezacy.item;
            biezacy = biezacy.nastepny;
            return item;
        }
    }
}
