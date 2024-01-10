package Context.service;

import org.springframework.stereotype.Service;

@Service
public class StereotypeBusinessService {
    private String msg = "Hello Spring context, nice to meet you. Thank you for reaching out through stereotype.";

    public String showMsg(){
        return msg;
    }
}
