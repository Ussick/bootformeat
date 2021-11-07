package ua.itea.bootformeat.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ua.itea.bootformeat.controller.CartController;
import ua.itea.bootformeat.service.ProductServce;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CartControllerImpl implements CartController {
    private ProductServce service;
    private Map<String, Integer> productEntityIntegerMap;

    @Autowired
    public void setService(ProductServce service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<Map<String,Integer>> cart(String quantity, String id, String operation) {
        if (productEntityIntegerMap==null){
            productEntityIntegerMap=new HashMap<>();
        }
        if (operation.equals("InCart")) {
            int count=(productEntityIntegerMap.get(id)!=null)? productEntityIntegerMap.get(id):0;
            System.out.println(count);
            productEntityIntegerMap.put(id, Integer.valueOf(quantity) + count);
        } else {
            if (Integer.valueOf(quantity) > 0) {
                productEntityIntegerMap.put(id, Integer.valueOf(quantity));
            }else {
                productEntityIntegerMap.remove(id);
            }
        }
        return new ResponseEntity<>(productEntityIntegerMap, HttpStatus.OK);
    }
}
