package io.github.springsongs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Getter
@Setter
@ToString
public class OtherInject {
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private int[] intArr;
    private Properties properties;
}
