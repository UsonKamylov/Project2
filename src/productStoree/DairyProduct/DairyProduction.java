package productStoree.DairyProduct;

import productStoree.Products;

import java.time.LocalDate;

public abstract class DairyProduction extends Products {
    public DairyProduction(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
