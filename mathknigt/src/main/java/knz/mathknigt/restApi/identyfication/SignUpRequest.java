package knz.mathknigt.restApi.identyfication;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SignUpRequest {
    @NonNull private String email;
    @NonNull private String password;
    @NonNull private String first_name;
    @NonNull private String second_name;
    @NonNull private String patronymic;
    @NonNull private String nickname;
    @NonNull private Date   birth_date;
}
