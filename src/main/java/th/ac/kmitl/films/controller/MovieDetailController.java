package th.ac.kmitl.films.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class MovieDetailController {

    @RequestMapping(value = "/movie/1", method = RequestMethod.GET)
    public String getDetail(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Fifty Shades Of Grey");
        modelAndView.addObject("description", "การพบกันครั้งแรกระหว่าง อนาสตาเซีย สตีล (ดาโกต้า จอห์นสัน) กับนักธุรกิจที่มีบาดแผลในใจ คริสเตียน เกรย์ (เจมี่ ดอร์แนน) ก่อเชื้อไฟที่ทำให้เกิดสัมพันธ์รักซึ่งเปลี่ยนแปลงชีวิตของคนทั้งสองไปอย่างไม่อาจหวนคืน อนาสตาเซีย รู้ดีเสมอว่าการรัก คริสเตียน นั้นไม่ใช่เรื่องง่าย และการใช้ชีวิตอยู่ร่วมกันจะทำให้เกิดความยุ่งยากในแบบที่เขาและเธอไม่คาดคิด อนาสตาเซีย ต้องเรียนรู้ที่จะที่จะใช้ชีวิตรุ่มรวยตามอย่าง คริสเตียน โดยไม่ทำให้ความเชื่อและอิสระของเธอถูกบั่นทอนไป ส่วน คริสเตียน ก็ต้องละซึ่งความอยากที่จะเข้าควบคุม และข้ามพ้นอดีตที่ยังหลอกหลอนเค้าให้ได้ ในที่สุดทั้งสองก็ได้อยู่ด้วยกัน ได้มีความรักอันลึกซึ้ง โลกทั้งใบจึงเต็มไปด้วยความเป็นไปได้มากมายไม่สิ้นสุด เมื่อทุกอย่างดูจะลงเอยด้วยดีแล้ว เคราะห์และโชคชะตากลับเล่นตลกด้วยการทำให้ฝันร้ายที่สุดของ อนาสตาเซีย เป็นจริง เรื่องราวจะเป็นอย่างไรต่อไป คริสเตียน และ อนาสตาเซีย จะเดินบนทางสายกุหลาบหรือขวากหนามกันแน่");
        modelAndView.addObject("pic", "https://acrosstheuniversepodcast.files.wordpress.com/2015/03/fifty-banner.png");
        modelAndView.addObject("creator", " Benning");
        modelAndView.addObject("actor", " Benning, Muse");
        return "Detail";
    }

    @RequestMapping(value = "/movie/2", method = RequestMethod.GET)
    public String getMovie2(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "After");
        modelAndView.addObject("description", "การพบกันครั้งแรกระหว่าง อนาสตาเซีย สตีล (ดาโกต้า จอห์นสัน) กับนักธุรกิจที่มีบาดแผลในใจ คริสเตียน เกรย์ (เจมี่ ดอร์แนน) ก่อเชื้อไฟที่ทำให้เกิดสัมพันธ์รักซึ่งเปลี่ยนแปลงชีวิตของคนทั้งสองไปอย่างไม่อาจหวนคืน อนาสตาเซีย รู้ดีเสมอว่าการรัก คริสเตียน นั้นไม่ใช่เรื่องง่าย และการใช้ชีวิตอยู่ร่วมกันจะทำให้เกิดความยุ่งยากในแบบที่เขาและเธอไม่คาดคิด อนาสตาเซีย ต้องเรียนรู้ที่จะที่จะใช้ชีวิตรุ่มรวยตามอย่าง คริสเตียน โดยไม่ทำให้ความเชื่อและอิสระของเธอถูกบั่นทอนไป ส่วน คริสเตียน ก็ต้องละซึ่งความอยากที่จะเข้าควบคุม และข้ามพ้นอดีตที่ยังหลอกหลอนเค้าให้ได้ ในที่สุดทั้งสองก็ได้อยู่ด้วยกัน ได้มีความรักอันลึกซึ้ง โลกทั้งใบจึงเต็มไปด้วยความเป็นไปได้มากมายไม่สิ้นสุด เมื่อทุกอย่างดูจะลงเอยด้วยดีแล้ว เคราะห์และโชคชะตากลับเล่นตลกด้วยการทำให้ฝันร้ายที่สุดของ อนาสตาเซีย เป็นจริง เรื่องราวจะเป็นอย่างไรต่อไป คริสเตียน และ อนาสตาเซีย จะเดินบนทางสายกุหลาบหรือขวากหนามกันแน่");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

}
