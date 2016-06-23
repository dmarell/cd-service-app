/*
 * Created by Daniel Marell 2016-06-23
 */
package se.caglabs.cdserviceapp;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RequestMapping("/")
@RestController
public class AppController {
    @ApiOperation("Get application version")
    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        return new Scanner(getClass().getResourceAsStream("/version.txt"), "UTF-8").useDelimiter("\\A").next();
    }
}
