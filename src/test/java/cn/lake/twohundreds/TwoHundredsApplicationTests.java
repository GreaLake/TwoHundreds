package cn.lake.twohundreds;

import cn.lake.twohundreds.entity.Character;
import cn.lake.twohundreds.mapper.CharacterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TwoHundredsApplicationTests {

    @Autowired
    CharacterMapper characterMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void findAllCharacterTest(){
        List<Character> allCharacter = characterMapper.findAllCharacter();
        System.out.println(allCharacter);
    }


}
