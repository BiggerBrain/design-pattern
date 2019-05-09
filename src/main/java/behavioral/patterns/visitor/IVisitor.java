
package behavioral.patterns.visitor;

/**
 * @author lishixiong
 * @version 1.0: IVisitor.java, v 0.1 2019年05月09日 19:56 lishixiong Exp $
 */
public interface IVisitor {
    void accept(SmsProduct smsProduct);

    void accept(MailProduct mailProduct);
}