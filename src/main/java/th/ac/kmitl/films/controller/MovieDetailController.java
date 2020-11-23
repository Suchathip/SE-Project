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

    @RequestMapping(value = "/movie/3", method = RequestMethod.GET)
    public String getMovie3(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Newness");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }
    @RequestMapping(value = "/movie/4", method = RequestMethod.GET)
    public String getMovie4(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Titanic");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/5", method = RequestMethod.GET)
    public String getMovie5(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Twilight");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/6", method = RequestMethod.GET)
    public String getMovie6(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Train to Pusan");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/7", method = RequestMethod.GET)
    public String getMovie7(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "John Wick");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/8", method = RequestMethod.GET)
    public String getMovie8(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Thor");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/9", method = RequestMethod.GET)
    public String getMovie9(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Avengers");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/10", method = RequestMethod.GET)
    public String getMovie10(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "The Fast of the Furious 8");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/11", method = RequestMethod.GET)
    public String getMovie11(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "ABO Minable");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/12", method = RequestMethod.GET)
    public String getMovie12(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Pets 2");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/13", method = RequestMethod.GET)
    public String getMovie13(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Rise Guardian");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/14", method = RequestMethod.GET)
    public String getMovie14(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Boss Baby");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/15", method = RequestMethod.GET)
    public String getMovie15(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Finding Nemo");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/16", method = RequestMethod.GET)
    public String getMovie16(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Harry Potter");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/17", method = RequestMethod.GET)
    public String getMovie17(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Beauty and the Beast");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/18", method = RequestMethod.GET)
    public String getMovie18(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Avatar");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/19", method = RequestMethod.GET)
    public String getMovie19(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Maleficent");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }

    @RequestMapping(value = "/movie/20", method = RequestMethod.GET)
    public String getMovie20(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Star War : The rise of skywalker");
        modelAndView.addObject("description", "“มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " Benning2");
        modelAndView.addObject("actor", " Benning2, Muse2");
        return "Detail";
    }
}
