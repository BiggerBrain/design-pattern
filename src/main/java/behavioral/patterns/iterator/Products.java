/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.iterator;

/**
 * @author lishixiong
 * @version 1.0: Products.java, v 0.1 2019年05月06日 22:35 lishixiong Exp $
 */
public class Products implements IAggregate {

    private Product[] products;
    private int       last = 0;

    public Products(int maxSize) {
        this.products = new Product[maxSize];

    }

    public Product at(int index) {
        return products[index];
    }

    public void addProduct(Product product) {
        this.products[last] = product;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new ProductIterator(this);
    }

    private class ProductIterator implements Iterator {
        private Products products;
        private int      index;

        public ProductIterator(Products products) {
            this.products = products;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            //return false;
            return index < products.getLength();
        }

        @Override
        public Object next() {
            //return null;
            Product product = products.at(index);
            index++;
            return product;
        }
    }
}