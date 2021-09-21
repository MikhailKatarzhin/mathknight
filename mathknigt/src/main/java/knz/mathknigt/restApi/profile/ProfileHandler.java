package knz.mathknigt.restApi.profile;

import knz.mathknigt.restApi.identyfication.IAuthenticationJWT;
import knz.mathknigt.restApi.identyfication.JWTPayload;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@AllArgsConstructor
public class ProfileHandler {

    final IAuthenticationJWT iAuthenticateJWT;

    @GetMapping("/profile/my")
    public ProfileInfoResponse getCountResolvedProblems(HttpServletRequest request){
        JWTPayload jwtPayload   = iAuthenticateJWT.checkAuthentication(request);
        if(jwtPayload == null)
            return new ProfileInfoResponse();

        return new ProfileInfoResponse();
    }
}
