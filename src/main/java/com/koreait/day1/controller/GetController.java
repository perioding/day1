package com.koreait.day1.controller;


import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //localhost:9090/api
public class GetController {

    //localhost:9090/api/getMethod
    @RequestMapping(method = RequestMethod.GET, path="/getMethod")
    public String getRequest(){
        return "getMethod 호출";
    }
    //localhost:9090/api/getParameter?id = apple&&pass=1234
    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam String pass) {
        System.out.println("id: " + id);
        System.out.println("pass: " + pass);
        return "getPara() 호출";
    }

    /*
    * id
    * name
    * email
    * age
    *  */
    //localhost:9090/apigetMultiParameter?id = apple&email=apple@apple.com&age=20
    @GetMapping("/getMultiParameter")
//    public String getMultiParam(
//        @RequestParam  String id;
//        @RequestParam String name;
//        @RequestParam String email;
//        @RequestParam int age;
//    ){
//
//    }
    public MultiParam getMultiParam(MultiParam multiParam){
        System.out.println("id :" + multiParam.getId());
        System.out.println("name :" + multiParam.getName());
        System.out.println("email :" + multiParam.getEmail());
        System.out.println("age :" + multiParam.getAge());
        return multiParam;
    }
    @PutMapping("/putMethod")
    public void put(){

    }
    @PatchMapping("/patchMethod")
    public void patch(){

    }
    @DeleteMapping("/deleteMethod")
    public void delete(){
        
    }

}
