package cn.lake.twohundreds.service;

import cn.lake.twohundreds.entity.Character;
import cn.lake.twohundreds.mapper.CharacterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lake
 * @Date: 2022/4/2 13:21
 * @Description:
 */
@Service
public class CharacterService {

    @Autowired
    CharacterMapper characterMapper;

    /**
     * 查询所有历史人物
     * @return
     */
    public List<Character> findAllCharacter(){
        List<Character> allCharacter = characterMapper.findAllCharacter();
        return allCharacter;
    }

    /**
     * 添加历史人物
     * @param name
     * @param cover
     * @param start_time
     * @param end_time
     * @param main_event
     * @param img
     * @return
     */
    public Boolean addCharacter(String name,String cover,String start_time,String end_time,String main_event,String img){
        if (characterMapper.addCharacter(name, cover, start_time, end_time, main_event, img)!=0){
            return true;
        }
        return false;
    }


}
