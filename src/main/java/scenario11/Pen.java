package scenario11;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Pen {
    @Setter @Getter
    private String brand;

    @Setter @Getter
    private String Color;

    @Setter @Getter
    private int price;


}
