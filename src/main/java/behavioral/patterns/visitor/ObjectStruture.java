
package behavioral.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiong
 * @version 1.0: ObjectStruture.java, v 0.1 2019年05月09日 20:04 lishixiong Exp $
 */
public class ObjectStruture {
    public static List<Product> getList() {
        List<Product> list = new ArrayList<>();
        list.add(new SmsProduct("中国移动", "sms"));
        list.add(new SmsProduct("中国联通", "sms"));
        list.add(new SmsProduct("中国电信", "sms"));
        list.add(new MailProduct("163邮箱", "mail"));
        list.add(new MailProduct("qq邮箱", "mail"));
        list.add(new MailProduct("gmail邮箱", "mail"));
        return list;
    }
}