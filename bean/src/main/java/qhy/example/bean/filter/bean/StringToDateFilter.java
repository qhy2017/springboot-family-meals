package qhy.example.bean.filter.bean;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import qhy.example.bean.util.MatchUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateFilter extends JsonDeserializer<Date> {
    private  SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    private static String regex =  "((19|20)[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])";

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Object currentValue = jsonParser.getCurrentValue();
        String valueAsString = jsonParser.getValueAsString();
        boolean match = MatchUtil.match(valueAsString, regex);
        if (match) {
            try {
                return formatter.parse(valueAsString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return new Date();
    }
}
