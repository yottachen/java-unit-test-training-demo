package scenario11;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;
import java.util.Set;

@Builder
public class Pen {
    @Setter
    @Getter
    private String brand;

    @Setter
    @Getter
    private String color;

    @Setter
    @Getter
    private int price;

    @Singular
    @Setter
    @Getter
    private List<String> occupations;

}
