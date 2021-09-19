package knz.mathknigt.database.model;

import knz.mathknigt.Config;
import lombok.*;

import javax.persistence.*;

@Table(name = "impact_set")
@Entity
@ToString
@AllArgsConstructor
@Getter
public class ImpactSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long    id;

    @Column(name = "physical_value", nullable = false)
    private Long    physical_value;

    @Column(name = "mental_value", nullable = false)
    private Long    mental_value;

    @OneToOne(mappedBy = "impact_set", cascade = CascadeType.ALL)
    private User    user;

    void setPhysical_value(@NonNull Long inphysical_value){
        try {
            if (inphysical_value < Config.MINIMALPHYSICALIMPACTVALUE
            || inphysical_value > Config.MAXIMALPHYSICALIMPACTVALUE) throw new Exception();
            this.physical_value = inphysical_value;
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    void setMental_value(@NonNull Long inMental_value){
        try {
            if (inMental_value < Config.MINIMALMENTALIMPACTVALUE
            || inMental_value > Config.MAXIMALMENTALIMPACTVALUE) throw new Exception();
            this.physical_value = inMental_value;
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public ImpactSet(){
        this.physical_value = 1L;
        this.mental_value   = 1L;
    }
}
