package ui.dataProviders;

import com.google.gson.Gson;

import javax.swing.text.html.parser.Entity;

public class DataProviderHelper {

    public static Entity createEntityFromSchema(String jsonSchema) {
        Gson gson = new Gson();
        return gson.fromJson(jsonSchema, Entity.class);
    }

}
