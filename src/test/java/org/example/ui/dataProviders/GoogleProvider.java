package org.example.ui.dataProviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GoogleProvider {

    @DataProvider(name = "googleSearch")
    public Iterator<Object[]> stringProvider() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{ "Hello World"});
        data.add(new Object[]{"Hello Perm"});

        return data.iterator();
    }
}
