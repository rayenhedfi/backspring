package tn.actia.pfe.Pfe_App.BrancheGitlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branche")
public class BrancheController {
@Autowired
BrancheService brancheService;
    @PostMapping("/add-branche")
    @ResponseBody
    public Branche saveBranche(@RequestBody Branche branche){
        return brancheService.saveBranche(branche);

    }

}
