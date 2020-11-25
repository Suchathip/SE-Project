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
        modelAndView.addObject("creator", " แซมเทย์เลอร์ - จอห์นสัน");
        modelAndView.addObject("actor", " ดาโกต้าจอห์นสัน ,เจมี่ดอร์แนน ,Jennifer Ehle ,มาร์เซียเกย์ฮาร์เดนe");
        return "Detail";
    }

    @RequestMapping(value = "/movie/2", method = RequestMethod.GET)
    public String getMovie2(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "After");
        modelAndView.addObject("description", "หลังจากติดตาม Tessa Youngนักเรียนที่อุทิศตนลูกสาวที่มีความซื่อสัตย์และแฟนสาวที่ซื่อสัตย์ต่อหวานใจในโรงเรียนมัธยมปลายของเธอเมื่อเธอเข้าสู่ภาคการศึกษาแรกในวิทยาลัย ด้วยความทะเยอทะยานอันยิ่งใหญ่สำหรับอนาคตของเธอโลกที่ได้รับการปกป้องของเธอก็เปิดกว้างขึ้นเมื่อเธอได้พบกับฮาร์ดินสก็อตต์ที่มืดมนและลึกลับกบฏแม่เหล็กที่ครุ่นคิดซึ่งทำให้เธอตั้งคำถามทั้งหมดที่เธอคิดว่าเธอรู้เกี่ยวกับตัวเองและสิ่งที่เธอต้องการจากชีวิต ในขณะที่พวกเขาเริ่มต้นความสัมพันธ์ที่เต็มไปด้วยความปรารถนาความปรารถนาความโกรธการทรยศและการโกหกพวกเขาจะได้รับการทดสอบเป็นรายบุคคลเนื่องจากความจริงเกี่ยวกับครอบครัวของพวกเขามากระทบพวกเขา ความรักจะเอาชนะอดีตได้หรือไม่?" );
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/5f/00/0e/5f000e05a132bf3a7466f48b3cfa519d.jpg");
        modelAndView.addObject("creator", " เจนนี่เกจ");
        modelAndView.addObject("actor", " Josephine Langford ,ฮีโร่ Fiennes Tiffin ,Selma Blair ,Shane Paul McGhie ,Khadijha Red Thunder ,Inanna Sarkis");
        return "Detail";
    }

    @RequestMapping(value = "/movie/3", method = RequestMethod.GET)
    public String getMovie3(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Newness");
        modelAndView.addObject("description", "ว่าด้วยเรื่องราวของคนในยุคปัจจุบันที่มีเทคโนโลยีเป็นสิ่งเชื่อมต่อความสัมพันธ์ เช่นเดียวกันกับ “มาร์ติน” และ “แกบี้” หนุ่มสาวโปรไฟล์ดี ที่ต่างคนต่างโสด นัดเจอกันผ่านแอพหาคู่ แล้วพบว่าพวกเขาเข้ากันได้ดี จึงพยายามสานความสัมพันธ์เป็นคู่จริง มากกว่าคู่รักชั่วคราว ทั้งคู่ตัดสินใจย้ายเข้ามาอยู่บ้านเดียวกัน ใช้ชีวิตเป็นคู่รัก แต่แล้วความเบื่อหน่ายก็เริ่มคืบคลานเข้ามา ทำให้ความสัมพันธ์ครั้งนี้ไม่ง่ายอย่างที่คิด");
        modelAndView.addObject("pic", "https://fwuhd.com/wp-content/uploads/2020/06/ls4hp-4KSVF92FQNH-Full-Image_GalleryCover-en-US-1516635723394._UR19201080_RI_.jpg");
        modelAndView.addObject("creator", " เดรก ดเรมัส ");
        modelAndView.addObject("actor", "Nicholas Hoult ,Laia Costa ,Courtney Eaton ,Danny Huston ,เจสสิก้าเฮนวิค ,Esther Perel");
        return "Detail";
    }
    @RequestMapping(value = "/movie/4", method = RequestMethod.GET)
    public String getMovie4(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Titanic");
        modelAndView.addObject("description", "84 ปีต่อมาผู้หญิงอายุ 100 ปีชื่อ Rose DeWitt Bukater เล่าเรื่องนี้ให้หลานสาวของเธอ Lizzy Calvert, Brock Lovett, Lewis Bodine, Bobby Buell และ Anatoly Mikailavich บน Keldysh เกี่ยวกับชีวิตของเธอในวันที่ 10 เมษายน 1912 บนเรือที่ชื่อว่า ไททานิกเมื่อโรสสาวน้อยขึ้นเรือที่กำลังออกเดินทางพร้อมกับผู้โดยสารชั้นสูงและแม่ของเธอรูธ เดอวิตต์บูคาเทอร์และคู่หมั้นของเธอคาลีดอนฮอคลีย์ ในขณะเดียวกันนักเร่ร่อนและศิลปินชื่อแจ็คดอว์สันและเพื่อนที่ดีที่สุดของเขาฟาบริซิโอเดรอสซีได้รับตั๋วชั้นสามไปยังเรือในเกม และเธออธิบายเรื่องราวทั้งหมดตั้งแต่ออกเดินทางในวันที่ 15 เมษายน 2455 เวลา 2:20 น.");
        modelAndView.addObject("pic", "https://images.squarespace-cdn.com/content/v1/5c75dfa97d0c9166551f52b1/1571759141591-I1RAI5I59E74DIYCLY57/ke17ZwdGBToddI8pDm48kENzcN03HYzgcdbISWm9QnQUqsxRUqqbr1mOJYKfIPR7LoDQ9mXPOjoJoqy81S2I8N_N4V1vUb5AoIIIbLZhVYxCRW4BPu10St3TBAUQYVKcpdY7UNZUQcclZ_A-o-_tdx6ePcTdqUrhi9leOnONJz5IYA4uOMwO6FO-U1ZS--pN/Large_3909.jpg?format=1500w");
        modelAndView.addObject("creator", " เจมส์ คาเมรอน ");
        modelAndView.addObject("actor", " ลีโอนาร์โด ดิแคพรีโอ ,เคต วินสเล็ต ,บิลลี เซน ,เคธี เบตส์");
        return "Detail";
    }

    @RequestMapping(value = "/movie/5", method = RequestMethod.GET)
    public String getMovie5(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Twilight");
        modelAndView.addObject("description", "Bella Swan มีความแตกต่างเล็กน้อยเสมอ ไม่เคยมีใครวิ่งไปกับฝูงชนเบลล่าไม่เคยสนใจที่จะเข้ากับสาว ๆ อินเทรนด์ที่โรงเรียนมัธยมฟีนิกซ์รัฐแอริโซนาของเธอ เมื่อแม่ของเธอแต่งงานใหม่และเบลล่าเลือกที่จะอยู่กับพ่อของเธอในเมืองฟอร์กส์วอชิงตันที่มีฝนตกชุกเธอไม่คาดหวังว่าจะมีอะไรเปลี่ยนแปลงมากนัก แต่สิ่งต่าง ๆ จะเปลี่ยนไปเมื่อเธอได้พบกับเอ็ดเวิร์ดคัลเลนผู้ลึกลับและน่าตื่นตา สำหรับเอ็ดเวิร์ดไม่มีอะไรเหมือนกับเด็กผู้ชายคนอื่น ๆ ที่เธอเคยพบ เขาไม่เหมือนใครที่เธอเคยพบมาระยะเวลา เขาฉลาดและมีไหวพริบและดูเหมือนว่าเขาจะมองเห็นวิญญาณของเธอโดยตรง ในเวลาไม่นานพวกเขาก็จมดิ่งลงไปในความรักนอกรีตที่เร่าร้อนและเด็ดเดี่ยว - นอกรีตเพราะเอ็ดเวิร์ดไม่เหมือนเด็กผู้ชายคนอื่น ๆ เขาสามารถวิ่งได้เร็วกว่าสิงโตภูเขาเขาสามารถหยุดรถที่กำลังเคลื่อนที่ได้ด้วยมือเปล่า โอ้เขายังไม่ได้อายุตั้งแต่ปี 1918 เหมือนแวมไพร์เขาเป็นอมตะ ถูกต้อง - แวมไพร์ แต่เขาไม่มีเขี้ยว - นั่นก็แค่ในหนัง และเขาไม่ ...");
        modelAndView.addObject("pic", "https://static.wixstatic.com/media/9c926d_eb565b783305420b91937179f002dabc.jpg");
        modelAndView.addObject("creator", " แคเธอรีน ฮาร์ดวิก");
        modelAndView.addObject("actor", " คริสเตน สจ๊วต ,โรเบิร์ต แพตตินสัน");
        return "Detail";
    }

    @RequestMapping(value = "/movie/6", method = RequestMethod.GET)
    public String getMovie6(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Train to Pusan");
        modelAndView.addObject("description", "ซอกวู เป็นผู้จัดการกองทุนที่มุ่งกอบโกยผลประโยชน์ส่วนตนเป็นสำคัญ และไม่มีเวลาให้ครอบครัว เขาอาศัยอยู่ในโซลกับลูกสาวชื่อซอซูอัน และคุณย่า ในวันเกิดของซูอัน เธอขอร้องให้ซอกวูพาไปหาแม่ที่เมืองปูซาน ซึ่งเป็นเวลาเดียวกันกับที่เชื้อโรคประหลาดได้แพร่ไปทั่วเมือง และบนรถไฟขบวนที่สองพ่อลูกนั่งไปก็มีหญิงสาวติดเชื้อลอบขึ้นไปด้วย เพียงไม่นาน ผู้คนบนรถไฟต่างก็รับรู้ข่าวการแพร่ระบาดของเชื้อโรคจนเกิดความวุ่นวายขึ้นทุกหนแห่ง สถานการณ์เลวร้ายลงเมื่อหญิงสาวที่แอบขึ้นมาบนขบวนรถไฟกลายเป็นซอมบี้ไล่ล่าผู้โดยสาร แม้รถไฟจะยุติการเดินทางที่เมืองแทจอน แต่เมื่อลงจากรถไฟทุกคนกลับพบว่าเมืองทั้งเมืองเต็มไปด้วยฝูงซอมบี้ ผู้โดยสารที่เหลือรอดจึงจำใจต้องเดินทางต่อไป ซอกวูที่พยายามช่วยเหลือแต่ตัวเองและลูกสาว กลับต้องมาร่วมมือกับคนอื่นๆ เพื่อเอาชีวิตรอด เขาได้เห็นเบื้องลึกของมนุษย์ที่แสดงออกมาในภาวะคับขัน ได้เห็นความสูญเสีย ความรัก ความเห็นแก่ตัว การเอาตัวรอด รวมถึงความบริสุทธิ์ของซูอัน ซึ่งผลักดันให้เขายอมแลก แม้กระทั่งสิ่งที่สำคัญที่สุดไป นั่นคือ ชีวิตของเขาเอง");
        modelAndView.addObject("pic", "https://i0.wp.com/porcupinebook.com/wp-content/uploads/2020/06/train-to-busan-korean-2016.jpg?fit=1200%2C600&ssl=1");
        modelAndView.addObject("creator", " ยอน ซังโฮ");
        modelAndView.addObject("actor", " กง ยู ,มา ดงซอก ,จอง ยูมี");
        return "Detail";
    }

    @RequestMapping(value = "/movie/7", method = RequestMethod.GET)
    public String getMovie7(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "John Wick");
        modelAndView.addObject("description", "ด้วยการเสียชีวิตก่อนวัยอันควรของภรรยาที่รักของเขายังคงขมขื่นอยู่ในปากของเขาจอห์นวิคอดีตมือสังหารผู้เชี่ยวชาญได้รับของขวัญชิ้นสุดท้ายจากเธอซึ่งเป็นของที่ระลึกล้ำค่าที่จะช่วยให้จอห์นพบความหมายใหม่ในชีวิตเมื่อเธอจากไปแล้ว แต่เมื่อเจ้าชายชาวรัสเซียผู้เย่อหยิ่ง Iosef Tarasov และคนของเขาจ่ายเงินให้ Wick ไปเยี่ยมเยียน Wick เพื่อปล้นเขาจาก Mustang ที่มีค่าของเขาในปี 1969 และของขวัญของภรรยาของเขานักฆ่าในตำนานจะถูกบังคับให้ค้นพบตัวตนที่ปกปิดอย่างพิถีพิถัน ตาบอดด้วยการแก้แค้นจอห์นจะปลดปล่อยห้วงมหรรณพแห่งการทำลายล้างที่ถูกจัดเตรียมอย่างระมัดระวังทันทีกับสิ่งสำคัญที่มีความซับซ้อน Viggo Tarasov และครอบครัวของเขาซึ่งตระหนักดีถึงขีดความสามารถในการสังหารของเขา ตอนนี้มีเพียงเลือดเท่านั้นที่สามารถดับความกระหายในการแก้แค้นของนักต้มตุ๋นได้");
        modelAndView.addObject("pic", "https://theflame.unishanoi.org/wp-content/uploads/2018/06/john-wick-900x500.jpg");
        modelAndView.addObject("creator", " แชด สตาเฮลสกี ,เดวิด ลิตช์ (ไม่ได้รับเครดิต)");
        modelAndView.addObject("actor", " เคอานู รีฟส์ ,ไมเคิล นิกควิสต์ ,อัลฟี อัลเลน ,แอเดรียน พาลิกกี");
        return "Detail";
    }

    @RequestMapping(value = "/movie/8", method = RequestMethod.GET)
    public String getMovie8(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Thor");
        modelAndView.addObject("description", "นักรบ ธ อร์ (คริสเฮมส์เวิร์ ธ ) ถูกขับออกจากดินแดนมหัศจรรย์แห่งแอสการ์ดโดยโอดิน (เซอร์แอนโธนีฮอปกินส์) พ่อของเขาเพราะความหยิ่งผยองและถูกส่งมายังโลกเพื่อใช้ชีวิตท่ามกลางมนุษย์ การตกหลุมรักกับนักวิทยาศาสตร์เจนฟอสเตอร์ (นาตาลีพอร์ตแมน) สอนบทเรียนที่จำเป็นสำหรับ ธ อร์และความแข็งแกร่งที่ค้นพบใหม่ของเขาเข้ามามีบทบาทในขณะที่วายร้ายจากบ้านเกิดเมืองนอนส่งพลังมืดมายังโลก");
        modelAndView.addObject("pic", "https://cdn.onebauer.media/one/empire-tmdb/films/10195/images/LvmmDZxkTDqp0DX7mUo621ahdX.jpg?quality=50&width=1800&ratio=16-9&resizeStyle=aspectfill&format=jpg");
        modelAndView.addObject("creator", " เคนเนธ บรานาห์");
        modelAndView.addObject("actor", " คริสเฮมส์เวิร์ ธ ,นาตาลีพอร์ตแมน ,ทอมฮิดเดิลสตัน");
        return "Detail";
    }

    @RequestMapping(value = "/movie/9", method = RequestMethod.GET)
    public String getMovie9(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Avengers");
        modelAndView.addObject("description", "ในขณะที่เหล่าอเวนเจอร์สและพันธมิตรยังคงปกป้องโลกจากภัยคุกคามที่ใหญ่เกินกว่าที่ฮีโร่คนใดคนหนึ่งจะรับมือได้จึงเกิดอันตรายใหม่จากเงามืดของจักรวาลนั่นคือธานอส เป้าหมายของเขาคือการรวบรวม Infinity Stones ทั้งหกชิ้นสิ่งประดิษฐ์ของพลังที่ไม่อาจจินตนาการได้และใช้มันเพื่อทำลายเจตจำนงที่บิดเบี้ยวของเขาต่อความเป็นจริงทั้งหมด ทุกสิ่งที่เหล่าอเวนเจอร์ต่อสู้เพื่อแย่งชิงมาจนถึงขณะนี้ชะตากรรมของโลกและการดำรงอยู่ไม่เคยมีความแน่นอนมากขึ้น");
        modelAndView.addObject("pic", "https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/14/1522924460-avengers-infinity-war-poster.jpg?crop=1xw:0.8888888888888888xh;center,top&resize=1200:*");
        modelAndView.addObject("creator", " โจ รุสโซ่ ,แอนโทนี่ รุสโซ่");
        modelAndView.addObject("actor", " รอเบิร์ต ดาวนีย์ จูเนียร์ ,คริส อีแวนส์ ,มาร์ก รัฟฟาโล ,คริส เฮมส์เวิร์ท ,สการ์เลตต์ โจแฮนส์สัน ,เจเรมี เรนเนอร์");
        return "Detail";
    }

    @RequestMapping(value = "/movie/10", method = RequestMethod.GET)
    public String getMovie10(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "The Fast of the Furious 8");
        modelAndView.addObject("description", "ตอนนี้ Dominic Toretto (Vin Diesel) และ Letty Ortiz (Michelle Rodriguez) อยู่ในช่วงฮันนีมูนและ Brian (Paul Walker) และ Mia (Jordana Brewster) ได้ออกจากเกมและทีมงานที่เหลือได้รับการยกเว้น ทีมงานได้พบความคล้ายคลึงของชีวิตปกติ แต่เมื่อหญิงลึกลับคนหนึ่งล่อลวงให้ดอมเข้าสู่โลกแห่งอาชญากรรมเขาดูเหมือนจะหนีไม่พ้นและการทรยศต่อคนที่ใกล้ชิดที่สุดพวกเขาจะต้องเผชิญกับการทดลองที่จะทดสอบพวกเขาอย่างที่ไม่เคยมีมาก่อน จากชายฝั่งคิวบาและถนนในนิวยอร์กซิตี้ไปจนถึงที่ราบอันเยือกเย็นนอกทะเลอาร์คติกแบเรนต์สกองกำลังชั้นนำจะกวาดล้างผู้คนทั่วโลกเพื่อหยุดยั้งผู้นิยมอนาธิปไตยจากการปลดปล่อยความโกลาหลบนเวทีโลกและนำตัวผู้ที่สร้างพวกเขากลับบ้าน");
        modelAndView.addObject("pic", "https://s.isanook.com/mv/0/ud/13/67453/2.jpg");
        modelAndView.addObject("creator", "  เอฟ. แกรี เกรย์");
        modelAndView.addObject("actor", " วิน ดีเซล ,ดเวย์น จอห์นสัน ,เจสัน สเตธัม ,มิเชลล์ ราดรีเกซ ,ไทรีส กิบสัน ,ลูดาคริส ,สกอตต์ อีสต์วุด");
        return "Detail";
    }

    @RequestMapping(value = "/movie/11", method = RequestMethod.GET)
    public String getMovie11(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "ABO Minable");
        modelAndView.addObject("description", "หลังจากพบเยติบนหลังคาอาคารอพาร์ทเมนต์ของเธอวัยรุ่นยี่และเพื่อนอีกสองคนจึงเริ่มภารกิจที่ยิ่งใหญ่เพื่อรวบรวมสัตว์วิเศษกับครอบครัวของเขาอีกครั้ง แต่ในการทำเช่นนั้นพวกเขาต้องนำหน้าหนึ่งก้าวของนักการเงินที่ร่ำรวยและนักสัตววิทยาผู้มุ่งมั่นที่ต้องการจับสัตว์ร้ายเพื่อผลประโยชน์ของตัวเอง");
        modelAndView.addObject("pic", "https://images.thaiza.com/content/b/448462.jpg");
        modelAndView.addObject("creator", " จิลล์คัลตัน");
        modelAndView.addObject("actor", " โคลอี้เบนเน็ต, เทนซิง นอร์เกย์ เทรนเนอร์ ,ซาราห์ พอลสัน ,เอ็ดดี้ อิซซาร์ด ,อัลเบิร์ต ช่าย");
        return "Detail";
    }

    @RequestMapping(value = "/movie/12", method = RequestMethod.GET)
    public String getMovie12(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Pets 2");
        modelAndView.addObject("description", "the Secret Life Of Pets เรื่องลับแก๊งขนฟู คือผลงานลำดับที่ 5 ซึ่งเป็นการจับมือกันระหว่างอิลลูมิเนชั่น เอนเตอร์เทนเมนต์และยูนิเวอร์แซล พิคเจอร์ส ซึ่งจะมาเผยความลับว่าเหล่าสัตว์เลี้ยงทำอะไร ระหว่างที่เจ้าของไม่อยู่บ้าน ภาพยนตร์เรื่องนี้ ได้นักแสดงตลกชื่อดังอย่าง หลุยส์ ซี.เค., อีริค สโตนสตรีท และเควิน ฮาร์ท มาให้เสียงพากย์ โดยได้ คริส เรโนด์ จาก Despicable Me, Despicable Me 2 มารับหน้าที่ผู้กำกับเตรียมพบกับความน่ารักของเหล่าสัตว์เลี้ยงแสนซน (สุดแสบ) ใน The Secret Life Of Pets เรื่องลับแก๊งขนฟู");
        modelAndView.addObject("pic", "https://img.elo7.com.br/product/original/24F3E98/painel-1-5x1-00-a-vida-secreta-dos-bichos-banner.jpg");
        modelAndView.addObject("creator", " คริส โรโนด์");
        modelAndView.addObject("actor", " แพตตัน ออสวอลท์ , เควิน ฮาร์ท , อีริค สโตนสตรีท");
        return "Detail";
    }

    @RequestMapping(value = "/movie/13", method = RequestMethod.GET)
    public String getMovie13(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Rise Guardian");
        modelAndView.addObject("description", "เริ่มด้วยการผจญภัยร่วมกันของ 5 เทพผู้พิทักษ์ ได้แก่ “ซานตาครอส”, “กระต่ายอีสเตอร์”, “นางฟ้าฟันน้ำนม”,”มนุษย์น้ำแข็ง”,”มนุษย์ทราย” ที่มีความสามารถต่างกัน เหล่าตำนานเทพในนิยาย อิงความเชื่อ และในความฝันของเด็กทั่วโลก ซึ่งในเวลาต้องมา ทั้ง5ตำนานจ้องรวมตัวกันเผชิญหน้ากับ “บูกี้แมน”\n" +
                "ผู้ชั่วช้าที่ต้องจะมาทำลาย ความฝันและจินตนา การเด็กๆและครอบ และ ครองมนุษยชาติ");
        modelAndView.addObject("pic", "https://i.ytimg.com/vi/mkUJQG4tbH4/maxresdefault.jpg");
        modelAndView.addObject("creator", " ปีเตอร์ แรมซีย์");
        modelAndView.addObject("actor", " คริส ไพน์ , ฮิว แจ็กแมน , จู๊ดลอว์ , อิซล่า ฟิชเชอร์");
        return "Detail";
    }

    @RequestMapping(value = "/movie/14", method = RequestMethod.GET)
    public String getMovie14(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Boss Baby");
        modelAndView.addObject("description", "ทิม เด็กชายที่มีครอบครัวแสนสมบูรณ์แบบ แต่แล้ววันหนี่งชีวิตของเขาก็เปลี่ยนจากหน้ามือเป็นหลังมือ เมื่อพ่อและแม่กลับบ้านและพาน้องชายซึ่งเป็นสมาชิกใหม่ของบ้าน ทว่าน้องชายคนใหม่ของเขาไม่ใช่เด็กทารกธรรมดา");
        modelAndView.addObject("pic", "https://f.ptcdn.info/188/050/000/onmo24kq4COaCMVVvIg-o.jpg");
        modelAndView.addObject("creator", " ทอม แมคแกรธ");
        modelAndView.addObject("actor", " เจพี คาร์เลค , เพียร์ซ แก็กนอน , เควิน ไมเคิล ริชาร์ดสัน");
        return "Detail";
    }

    @RequestMapping(value = "/movie/15", method = RequestMethod.GET)
    public String getMovie15(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Finding Nemo");
        modelAndView.addObject("description", "Finding Nemo คือเรื่องราวการผจญภัยอันน่าตื่นเต้นและสนุกสนานของ \"มาร์ลิน\" ปลาการ์ตูนผู้หวงลูกจนเกินเหตุ (พากย์โดย อัลเบิร์ต บรู๊คส์) และลูกชายของเขา \"นีโม\" (พากย์โดย อเล็กซานเดอร์ กูลด์) ที่พลัดหลงกันในแนวปะการังใหญ่ เมื่อนีโมถูกจับตัวไปจากมหาสมุทรซึ่งเป็นบ้านของเขา ไปอยู่ในตู้ปลาในห้องทำงานของหมอฟันคนหนึ่ง ด้วยการช่วยเหลือของเพื่อนร่วมทางอย่าง ดอรี่ (พากย์โดย เอลเลน ดีเจเนอเรส) ปลาบลูแทงจ์ผู้เป็นมิตรแต่ความจำสั้น มาร์ลิน ได้ออกเดินทางสู่เส้นทางสุดอันตรายด้วยความพยายามอันยิ่งใหญ่ทุกวิถีทางเพื่อช่วยเหลือลูกชายของเขา ที่รวบรวมความกล้ากับแผนการหาทางกลับบ้านด้วยตัวเอง");
        modelAndView.addObject("pic", "https://disguise.com/pub/media/aw_sbb/brand/aw_shopbybrand/image//b/r/brand_findingnemo.jpg");
        modelAndView.addObject("creator", " แอนดรูว์ สแตนตัน");
        modelAndView.addObject("actor", " อัลเบิร์ค บรูคส์ , เอลเลนน ดีเจนเนอริส , อเล็กซานเดอร์ โกลด์ ");
        return "Detail";
    }

    @RequestMapping(value = "/movie/16", method = RequestMethod.GET)
    public String getMovie16(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Harry Potter and the Prisoner of Azkaban ");
        modelAndView.addObject("description", "ย่อ เรื่องราวของนักโทษจากคุกอัซคาบัน ซีเรียส แบล็ค ที่หลบหนีจากที่คุมขังสุดแน่นหนา เล่าลือกันว่าเขาคือสมุนที่เกงที่สุดของคนที่คุณก็รู้ว่าใคร  เขาว่าการออกจากคุกครั้งนี้มีจุดประสงค์เพื่อสังหาร แฮรี่ พอตเตอร์ ");
        modelAndView.addObject("pic", "https://fbcstark.org/wp-content/uploads/2020/05/-3.jpg");
        modelAndView.addObject("creator", " อัลฟอนโซ กัวรอน");
        modelAndView.addObject("actor", " แดเนียล แรดคลิฟฟ์ , เอ็มมา วัตสัน , รูเพิร์ต กรินท์");
        return "Detail";
    }

    @RequestMapping(value = "/movie/17", method = RequestMethod.GET)
    public String getMovie17(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Beauty and the Beast");
        modelAndView.addObject("description", "เจ้าชายที่เห็นแก่ตัวถูกสาปให้เป็นสัตว์ประหลาดตลอดชีวิตของเขา เว้นแต่ว่าเขาเรียนรู้ที่จะรักใครสักคนและได้รับความรักตอบแทน คำสาปจะถูกคลาย");
        modelAndView.addObject("pic", "https://i2.wp.com/www.disneytouristblog.com/wp-content/uploads/2017/06/beauty-beast-live-action-disney-2017.jpg?ssl=1");
        modelAndView.addObject("creator", " บิล คอนดอน");
        modelAndView.addObject("actor", " เอ็มมา วัตสัน , แดน สตีเวนส์");
        return "Detail";
    }

    @RequestMapping(value = "/movie/18", method = RequestMethod.GET)
    public String getMovie18(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Avatar");
        modelAndView.addObject("description", "Avatar จะนำผู้ชมภาพยนตร์ก้าวสู่โลกใหม่ที่สุดตะลึงตาเหนือล้ำจินตนาการ เมื่อฮีโร่ผู้จำใจต้องออกเดินทางเพื่อปลดเปลื้องและบุกเบิก พร้อมเป็นผู้นำแห่งสงครามเพื่อปกป้องโลกของมนุษย์ต่างดาวที่เขาเรียกว่าบ้าน เจมส์ คาเมรอน ผู้กำกับเจ้าของรางวัลออสการ์จากภาพยนตร์ Titanic มีโครงเรื่องภาพยนตร์เรื่องนี้อยู่ในใจตั้งแต่ 15 ปีที่แล้ว แต่ด้วยข้อจำกัดทางเทคนิคในตอนนั้นจึงไม่สามารถถ่ายทอดจินตนาการออกมาเป็นภาพได้ บัดนี้ เขาใช้เวลากว่า 4 ปีในการถ่ายทำภาพยนตร์เรื่อง Avatar ภาพยนตร์แนวไลฟ์แอคชั่นที่ใช้สเปเชี่ยลเอฟเฟ็คสุดไฮเทค Avatar ถูกสร้างออกมาอย่างสมบูรณ์แบบด้วยวิวัฒนาการทางเทคโนโลยีภาพยนตร์ ที่หลอมเราเข้าไปในโลกแห่งอารมณ์และเรื่องราวของตัวละคร");
        modelAndView.addObject("pic", "https://www.catdumb.com/wp-content/uploads/2018/05/3-7.jpg");
        modelAndView.addObject("creator", " เจมส์ คาเมรอน");
        modelAndView.addObject("actor", " แซม เวิร์ธธิงตัน , โซอี ซัลดานา , สตีเฟน แลง , มิเชลล์ ราดรีเกซ");
        return "Detail";
    }

    @RequestMapping(value = "/movie/19", method = RequestMethod.GET)
    public String getMovie19(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Maleficent");
        modelAndView.addObject("description", "การถูกหักหลังครั้งใหญ่ที่เปลี่ยนจิตใจอันบริสุทธิ์ของเธอให้กลายเป็นดั่งหิน พลักดันด้วยความเคียดแค้นและความปรารถนาอันแรงกล้าที่จะปกป้องชาวมัวร์ภายใต้การปกครองของเธอ มาเลฟิเซนต์ (แองเจลิน่า โจลี่) ได้ปลดปล่อยคำสาปไปสู่ทารกน้อยแรกเกิดของพระราชา ออโรร่า เมื่อทารกน้อยเติบโตขึ้น ออโรร่า ต้องตกอยู่ภายใต้ความขัดแย้งระหว่างอาณาจักรต้นไม้ที่เธอเติบโตมาพร้อมความรักและอาณาจักรมนุษย์ที่สืบสานความยิ่งใหญ่ของตระกูลเธอ มาเลฟิเซนต์ ตระหนักว่า ออโรร่า อาจจะเป็นกุญแจที่จะนำความสงบสุขมาสู่ดินแดน และถูกบังคับให้ต้องลงมือทำบางสิ่งที่จะเปลี่ยนโลกทั้งสองใบไปตลอดกาล");
        modelAndView.addObject("pic", "https://i.pinimg.com/originals/99/3f/4e/993f4e470ee6e2b441378985817005d4.jpg");
        modelAndView.addObject("creator", " โรเบิร์ต สตรอมเบิร์ก");
        modelAndView.addObject("actor", " แองเจลินา โจลี่ , แอล แฟนนิง ชาร์ลโต คอปเลย์");
        return "Detail";
    }

    @RequestMapping(value = "/movie/20", method = RequestMethod.GET)
    public String getMovie20(ModelAndView modelAndView, Model model) {
        modelAndView.addObject("title", "Star War : The rise of skywalker");
        modelAndView.addObject("description", "มหากาพย์ของสงครามอวกาศเดินทางมาถึงจุดสิ้นสุดของไตรภาคใหม่ เหตุการณ์หลังจาก ไคโล เรน (อดัม ไดรเวอร์) นำกองทัพกวาดล้างกลุ่มกบฎ ซึ่งคราวนี้แตกพ่าย โดยมี เรย์ (เดซี่ ริดลีย์) นำเจ้าหญิงเลอาห์และกลุ่มกบฎขึ้นยานมิลเลนเนียมฟัลคอน หลบหนีไป ในขณะที่ ลุค สกายวอล์คเกอร์ ได้ใช้พลังเจไดเฮือกสุดท้ายในการไคโล เรน ก่อนที่เขาจะเสียชีวิตไปตามวิถีของเจได");
        modelAndView.addObject("pic", "https://i2.wp.com/moviewthai.com/wp-content/uploads/2020/01/star-wars-the-rise-of-skywalker-empire-magazine-textless-covers-new.jpg?fit=2048%2C1326&ssl=1");
        modelAndView.addObject("creator", " เจ.เจ. อับรามส์");
        modelAndView.addObject("actor", " บิลลี่ ลอร์ด , เดซี่ ริดลีย์ , อดัท ไดรเวอร์");
        return "Detail";
    }
}
