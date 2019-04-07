package com.group7.edu;

import com.group7.edu.entity.AnswerQuestion;
import com.group7.edu.mapper.AnswerQuestionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EduApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private AnswerQuestionMapper answerQuestionMapper;

    @Test
    public void insertQa() {
        Random rnd = new Random();
        String string = "20世纪90年代，硬件领域出现了单片式计算机系统，这种价格低廉的系统一出现就立即引起了自动控制领域人员的注意，因为使用它可以大幅度提升消费类电子产品（如电视机顶盒、面包烤箱、移动电话等）的智能化程度。Sun公司为了抢占市场先机，在1991年成立了一个称为Green的项目小组，帕特里克、詹姆斯·高斯林、麦克·舍林丹和其他几个工程师一起组成的工作小组在加利福尼亚州门洛帕克市沙丘路的一个小工作室里面研究开发新技术，专攻计算机在家电产品上的嵌入式应用。由于C++所具有的优势，该项目组的研究人员首先考虑采用C++来编写程序。但对于硬件资源极其匮乏的单片式系统来说，C++程序过于复杂和庞大。另外由于消费电子产品所采用的嵌入式处理器芯片的种类繁杂，如何让编写的程序跨平台运行也是个难题。为了解决困难，他们首先着眼于语言的开发，假设了一种结构简单、符合嵌入式应用需要的硬件平台体系结构并为其制定了相应的规范，其中就定义了这种硬件平台的二进制机器码指令系统（即后来成为“字节码”的指令系统），以待语言开发成功后，能有半导体芯片生产商开发和生产这种硬件平台。对于新语言的设计，Sun公司研发人员并没有开发一种全新的语言，而是根据嵌入式软件的要求，对C++进行了改造，去除了留在C++的一些不太实用及影响安全的成分，并结合嵌入式系统的实时性要求，开发了一种称为Oak的面向对象语言。";
        for (int i = 0; i < 20; i++) {
            AnswerQuestion answerQuestion = new AnswerQuestion();
            int i1 = rnd.nextInt(string.length() - 20);
            answerQuestion.setQuestion(string.substring(i1, i1 + rnd.nextInt(15) + 5));
            int i2 = rnd.nextInt(string.length() - 20);
            answerQuestion.setAnswer(string.substring(i2, i2 + rnd.nextInt(15) + 5));
            answerQuestionMapper.insert(answerQuestion);
        }
    }
}
