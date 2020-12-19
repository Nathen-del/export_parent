package cn.nathen.web.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: ��������ת����
 * �Զ�������ת�������裺
 *     1. ʵ��Converter�ӿڣ�����ʵ�ֽӿڵķ���
 *     2. �����Զ�������ת�����Ķ���
 *     3. ������ת������������ת�����Ĺ���
 *     4. ������ת�����Ĺ�������ע������ȥ����
 */
public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) { //source -->�û�������ַ���

        try {
            if (!StringUtils.isEmpty(source)){
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");
                //����ȥ
                return dateFormat.parse(source);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        //����
        return null;
    }
}
