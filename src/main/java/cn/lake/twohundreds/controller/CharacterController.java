package cn.lake.twohundreds.controller;

import cn.lake.twohundreds.Untils.Result;
import cn.lake.twohundreds.entity.Character;
import cn.lake.twohundreds.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: lake
 * @Date: 2022/4/2 13:39
 * @Description:
 */
@RestController
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @GetMapping("/character/findAll")
    public List<Character> findAllCharacter(){
        List<Character> allCharacter = characterService.findAllCharacter();
        return allCharacter;
    }

//    前端请求传Json对象的字符串则后端使用@RequestBody。

    @PostMapping("/character/saveCharacter")
    public Result addCharacter(@RequestBody Map<String,Object> map){
        String name = (String) map.get("name");
        String cover = (String) map.get("cover");
        String start_time = (String) map.get("start_time");
        String end_time = (String) map.get("end_time");
        String main_event = (String) map.get("main_event");
        String img = (String) map.get("img");
        Boolean flag = characterService.addCharacter(name, cover, start_time, end_time, main_event, img);
        return new Result(200,flag,"/saveCharacter");
    }

//    前端请求传Json对象则后端使用@RequestParam；

    @PostMapping("/character/addCharacter")
    public Result saveCharacter(@RequestParam String name,
                                @RequestParam String cover,
                                @RequestParam String start_time,
                                @RequestParam String end_time,
                                @RequestParam String main_event,
                                @RequestParam String img){
        return new Result(200,
                characterService.addCharacter(name, cover,
                        start_time, end_time, main_event, img),
                "/saveCharacter");
    }


}
