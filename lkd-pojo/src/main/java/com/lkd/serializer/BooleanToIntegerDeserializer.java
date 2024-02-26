package com.lkd.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class BooleanToIntegerDeserializer extends JsonDeserializer<Integer> {

    @Override
    public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        // 判断值的类型
        if (jsonParser.getCurrentToken().isBoolean()) {
            // 从 JSON 中读取布尔值并转换为整数
            boolean value = jsonParser.getBooleanValue();
            return value ? 1 : 0;
        } else{
            // 直接返回整数值
            return jsonParser.getIntValue();
        }
    }
}
