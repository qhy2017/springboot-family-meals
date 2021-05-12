package qhy.example.web.xmlToBean;

public class Test {

    public static void main(String[] args) {
        StringBuffer sr = new StringBuffer();
        sr.append("3C3F786D6C2076657273696F6E3D22312E302220656E636F64696E673D227574662D38223F3E3C444154413E3C526F773E3C41706E756D3E32303037333030373336343439313534313C2F41706E756D3E3C4865616465723E3C4D414E44543E3830303C2F4D414E44543E3C444F434E4F3E303030303030323438303C2F444F434E4F3E3C564552534E3E3030313C2F564552534E3E3C53595754593E474130313C2F53595754593E3C42554B52533E383539303C2F42554B52533E3C474A4148523E303030303C2F474A4148523E3C56455249533E3030303C2F56455249533E3C5354554E523E3030303C2F5354554E523E3C41504E554D3E323030373330");
        sr.append("30373336343439313534313C2F41504E554D3E3C435A4441543E303030302D30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C544A4E414D3E504C5A48414E473C2F544A4E414D3E3C544A4441543E323032302D30372D33303C2F544A4441543E3C544A5A45543E31353A33353A35303C2F544A5A45543E3C41504441593E303C2F41504441593E3C4E414D45544558543EE5BCA0E4B8BD3C2F4E414D45544558543E3C5A514B44483E303030303030323438303C2F5A514B44483E3C50535049443E474E42463134303033353C2F50535049443E3C504F5354313E3132E4B887E590A82FE5B9B4E9868BE985B8E7");
        sr.append("94B2E985AFE58AA0E6B0A2E588B6E4B999E98687E68890E5A597E68A80E69CAFE5BC80E58F913C2F504F5354313E3C5A434D49534E4F3E4E4743463139303030313C2F5A434D49534E4F3E3C5A434D49534F443E313930303039303030393C2F5A434D49534F443E3C5A4352544E414D453EE58D97E4BAACE68A95E585A5E6B395E6B58BE8AF95E9A1B9E79BAE313C2F5A4352544E414D453E3C4B554E4E523E303033313735303030303C2F4B554E4E523E3C4E414D45313EE88C82E5908DE58886E585ACE58FB83C2F4E414D45313E3C5A52454C41544956453E303033313735303030303C2F5A52454C41544956453E3C5A52454C41544956454E414D453E");
        sr.append("E88C82E5908DE58886E585ACE58FB83C2F5A52454C41544956454E414D453E3C5A534430353E323032302D30372D32393C2F5A534430353E3C5A4E414D453EE4B8ADE59BBDE79FB3E6B2B9E58C96E5B7A5E882A1E4BBBDE69C89E99990E585ACE58FB8E88C82E5908DE58886E585ACE58FB83C2F5A4E414D453E3C5A5441583E342E3431452B31343C2F5A5441583E3C5A4144443EE88C82E5908DE5B882E58F8CE5B1B1E59B9BE8B7AF39E58FB7E5A4A7E999A231E58FB7E6A5BC3C2F5A4144443E3C53544154533E413C2F53544154533E3C2F4865616465723E3C4974656D3E3C4D414E44543E3830303C2F4D414E44543E3C564552534E3E3030303C2F56");
        sr.append("4552534E3E3C474A4148523E303030303C2F474A4148523E3C504F534E523E3030303030303C2F504F534E523E3C435A4441543E303030302D30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C5442464C473E313C2F5442464C473E3C54424E414D3EE689BFE58C85E696B93C2F54424E414D3E3C5A514B44483E303030303030323438303C2F5A514B44483E3C5A534458483E3030303031303C2F5A534458483E3C5A534430373EE8AEBEE8AEA1E8B4B9EFBC88E8AEBEE8AEA1E4BABAE5B7A5E68890E69CACEFBC893C2F5A534430373E3C5A534430383E3130302E30303C2F5A534430383E3C5A534430393E30");
        sr.append("2E30303C2F5A534430393E3C5A534431303E3130302E30303C2F5A534431303E3C5A534431313E3130302E30303C2F5A534431313E3C5A534431323E302E30303C2F5A534431323E3C5A534431333E302E30303C2F5A534431333E3C5A534431343E302E30303C2F5A534431343E3C5A534431353E302E30303C2F5A534431353E3C5A534431363E302E30303C2F5A534431363E3C5A534431373E302E30303C2F5A534431373E3C5A534431393E302E30303C2F5A534431393E3C5A534432303E302E30303C2F5A534432303E3C5A534432313E302E30303C2F5A534432313E3C5A534432323E302E30303C2F5A534432323E3C5A4E455456414C55453E302E");
        sr.append("30303C2F5A4E455456414C55453E3C5A5441584D3E302E30303C2F5A5441584D3E3C414D4F554E543E302E3030303C2F414D4F554E543E3C50524943453E302E30303C2F50524943453E3C4D4F4E45593E302E30303C2F4D4F4E45593E3C4B4F4E54533E323137313031303530303C2F4B4F4E54533E3C54585432303EE5BA94E4BAA4E7A88EE8B4B92DE5BA94E4BAA4E5A29EE580BCE7A88E2DE99480E9A1B9E7A88EE9A29D2DE59BBDE586852DE586853C2F54585432303E3C2F4974656D3E3C4974656D3E3C4D414E44543E3830303C2F4D414E44543E3C564552534E3E3030303C2F564552534E3E3C474A4148523E303030303C2F474A4148523E3C504F");
        sr.append("534E523E3030303030303C2F504F534E523E3C435A4441543E303030302D30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C5442464C473E323C2F5442464C473E3C54424E414D3EE58F91E58C85E696B93C2F54424E414D3E3C5A514B44483E303030303030323438303C2F5A514B44483E3C5A534458483E3030303031303C2F5A534458483E3C5A53444C593E583C2F5A53444C593E3C5A534430373EE8AEBEE8AEA1E8B4B9EFBC88E8AEBEE8AEA1E4BABAE5B7A5E68890E69CACEFBC893C2F5A534430373E3C5A534430383E3130302E30303C2F5A534430383E3C5A534430393E302E30303C2F5A534430393E");
        sr.append("3C5A534431303E3130302E30303C2F5A534431303E3C5A534431313E3130302E30303C2F5A534431313E3C5A534431323E302E30303C2F5A534431323E3C5A534431333E302E30303C2F5A534431333E3C5A534431353E302E30303C2F5A534431353E3C5A534431363E302E30303C2F5A534431363E3C5A534431373E302E30303C2F5A534431373E3C5A534431393E302E30303C2F5A534431393E3C5A534432303E302E30303C2F5A534432303E3C5A534432313E302E30303C2F5A534432313E3C5A534432323E302E30303C2F5A534432323E3C5A4E455456414C55453E302E30303C2F5A4E455456414C55453E3C5A5441584D3E302E30303C2F5A5441");
        sr.append("584D3E3C414D4F554E543E302E3030303C2F414D4F554E543E3C50524943453E302E30303C2F50524943453E3C4D4F4E45593E302E30303C2F4D4F4E45593E3C4B4F4E54533E323137313031303530303C2F4B4F4E54533E3C54585432303EE5BA94E4BAA4E7A88EE8B4B92DE5BA94E4BAA4E5A29EE580BCE7A88E2DE99480E9A1B9E7A88EE9A29D2DE59BBDE586852DE586853C2F54585432303E3C2F4974656D3E3C4974656D3E3C4D414E44543E3830303C2F4D414E44543E3C564552534E3E3030303C2F564552534E3E3C474A4148523E303030303C2F474A4148523E3C504F534E523E3030303030303C2F504F534E523E3C435A4441543E303030302D");
        sr.append("30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C5442464C473E313C2F5442464C473E3C54424E414D3EE689BFE58C85E696B93C2F54424E414D3E3C5A514B44483E303030303030323438303C2F5A514B44483E3C5A534458483E3030303032303C2F5A534458483E3C5A534430373EE8AEBEE5A487E69D90E69699E8B4B93C2F5A534430373E3C5A534430383E3130302E30303C2F5A534430383E3C5A534430393E302E30303C2F5A534430393E3C5A534431303E3130302E30303C2F5A534431303E3C5A534431313E3130302E30303C2F5A534431313E3C5A534431323E302E30303C2F5A534431323E3C5A53");
        sr.append("4431333E302E30303C2F5A534431333E3C5A534431343E302E30303C2F5A534431343E3C5A534431353E302E30303C2F5A534431353E3C5A534431363E302E30303C2F5A534431363E3C5A534431373E302E30303C2F5A534431373E3C5A534431393E302E30303C2F5A534431393E3C5A534432303E302E30303C2F5A534432303E3C5A534432313E302E30303C2F5A534432313E3C5A534432323E302E30303C2F5A534432323E3C5A4E455456414C55453E302E30303C2F5A4E455456414C55453E3C5A5441584D3E302E30303C2F5A5441584D3E3C414D4F554E543E302E3030303C2F414D4F554E543E3C50524943453E302E30303C2F50524943453E3C");
        sr.append("4D4F4E45593E302E30303C2F4D4F4E45593E3C4B4F4E54533E323137313031303530303C2F4B4F4E54533E3C54585432303EE5BA94E4BAA4E7A88EE8B4B92DE5BA94E4BAA4E5A29EE580BCE7A88E2DE99480E9A1B9E7A88EE9A29D2DE59BBDE586852DE586853C2F54585432303E3C2F4974656D3E3C4974656D3E3C4D414E44543E3830303C2F4D414E44543E3C564552534E3E3030303C2F564552534E3E3C474A4148523E303030303C2F474A4148523E3C504F534E523E3030303030303C2F504F534E523E3C435A4441543E303030302D30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C5442464C473E323C");
        sr.append("2F5442464C473E3C54424E414D3EE58F91E58C85E696B93C2F54424E414D3E3C5A514B44483E303030303030323438303C2F5A514B44483E3C5A534458483E3030303032303C2F5A534458483E3C5A53444C593E583C2F5A53444C593E3C5A534430373EE8AEBEE5A487E69D90E69699E8B4B93C2F5A534430373E3C5A534430383E3130302E30303C2F5A534430383E3C5A534430393E302E30303C2F5A534430393E3C5A534431303E3130302E30303C2F5A534431303E3C5A534431313E3130302E30303C2F5A534431313E3C5A534431323E302E30303C2F5A534431323E3C5A534431333E302E30303C2F5A534431333E3C5A534431353E302E30303C2F");
        sr.append("5A534431353E3C5A534431363E302E30303C2F5A534431363E3C5A534431373E302E30303C2F5A534431373E3C5A534431393E302E30303C2F5A534431393E3C5A534432303E302E30303C2F5A534432303E3C5A534432313E302E30303C2F5A534432313E3C5A534432323E302E30303C2F5A534432323E3C5A4E455456414C55453E302E30303C2F5A4E455456414C55453E3C5A5441584D3E302E30303C2F5A5441584D3E3C414D4F554E543E302E3030303C2F414D4F554E543E3C50524943453E302E30303C2F50524943453E3C4D4F4E45593E302E30303C2F4D4F4E45593E3C4B4F4E54533E323137313031303530303C2F4B4F4E54533E3C54585432");
         sr.append("303EE5BA94E4BAA4E7A88EE8B4B92DE5BA94E4BAA4E5A29EE580BCE7A88E2DE99480E9A1B9E7A88EE9A29D2DE59BBDE586852DE586853C2F54585432303E3C2F4974656D3E3C4974656D3E3C4D414E44543E3830303C2F4D414E44543E3C564552534E3E3030303C2F564552534E3E3C474A4148523E303030303C2F474A4148523E3C504F534E523E3030303030303C2F504F534E523E3C435A4441543E303030302D30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C5442464C473E313C2F5442464C473E3C54424E414D3EE689BFE58C85E696B93C2F54424E414D3E3C5A514B44483E30303030303032343830");
         sr.append("3C2F5A514B44483E3C5A534458483E3030303033303C2F5A534458483E3C5A534430373EE696BDE5B7A5E8B4B93C2F5A534430373E3C5A534430383E3130302E30303C2F5A534430383E3C5A534430393E302E30303C2F5A534430393E3C5A534431303E3130302E30303C2F5A534431303E3C5A534431313E3130302E30303C2F5A534431313E3C5A534431323E302E30303C2F5A534431323E3C5A534431333E302E30303C2F5A534431333E3C5A534431343E302E30303C2F5A534431343E3C5A534431353E302E30303C2F5A534431353E3C5A534431363E302E30303C2F5A534431363E3C5A534431373E302E30303C2F5A534431373E3C5A534431393E");
         sr.append("302E30303C2F5A534431393E3C5A534432303E302E30303C2F5A534432303E3C5A534432313E302E30303C2F5A534432313E3C5A534432323E302E30303C2F5A534432323E3C5A4E455456414C55453E302E30303C2F5A4E455456414C55453E3C5A5441584D3E302E30303C2F5A5441584D3E3C414D4F554E543E302E3030303C2F414D4F554E543E3C50524943453E302E30303C2F50524943453E3C4D4F4E45593E302E30303C2F4D4F4E45593E3C4B4F4E54533E323137313031303530303C2F4B4F4E54533E3C54585432303EE5BA94E4BAA4E7A88EE8B4B92DE5BA94E4BAA4E5A29EE580BCE7A88E2DE99480E9A1B9E7A88EE9A29D2DE59BBDE586852D");
         sr.append("E586853C2F54585432303E3C2F4974656D3E3C4974656D3E3C4D414E44543E3830303C2F4D414E44543E3C564552534E3E3030303C2F564552534E3E3C474A4148523E303030303C2F474A4148523E3C504F534E523E3030303030303C2F504F534E523E3C435A4441543E303030302D30302D30303C2F435A4441543E3C435A5A45543E30303A30303A30303C2F435A5A45543E3C5442464C473E323C2F5442464C473E3C54424E414D3EE58F91E58C85E696B93C2F54424E414D3E3C5A514B44483E303030303030323438303C2F5A514B44483E3C5A534458483E3030303033303C2F5A534458483E3C5A53444C593E583C2F5A53444C593E3C5A53443037");
         sr.append("3EE696BDE5B7A5E8B4B93C2F5A534430373E3C5A534430383E3130302E30303C2F5A534430383E3C5A534430393E302E30303C2F5A534430393E3C5A534431303E3130302E30303C2F5A534431303E3C5A534431313E3130302E30303C2F5A534431313E3C5A534431323E302E30303C2F5A534431323E3C5A534431333E302E30303C2F5A534431333E3C5A534431353E302E30303C2F5A534431353E3C5A534431363E302E30303C2F5A534431363E3C5A534431373E302E30303C2F5A534431373E3C5A534431393E302E30303C2F5A534431393E3C5A534432303E302E30303C2F5A534432303E3C5A534432313E302E30303C2F5A534432313E3C5A5344");
         sr.append("32323E302E30303C2F5A534432323E3C5A4E455456414C55453E302E30303C2F5A4E455456414C55453E3C5A5441584D3E302E30303C2F5A5441584D3E3C414D4F554E543E302E3030303C2F414D4F554E543E3C50524943453E302E30303C2F50524943453E3C4D4F4E45593E302E30303C2F4D4F4E45593E3C4B4F4E54533E323137313031303530303C2F4B4F4E54533E3C54585432303EE5BA94E4BAA4E7A88EE8B4B92DE5BA94E4BAA4E5A29EE580BCE7A88E2DE99480E9A1B9E7A88EE9A29D2DE59BBDE586852DE586853C2F54585432303E3C2F4974656D3E3C2F526F773E3C2F444154413E2020202020202020202020202020202020202020202020");
        System.out.println(hexStr2Str(sr.toString()));


//    System.out.println(hexStr2Str(sr.toString()));
    }

    public static String hexStr2Str(String hexStr) {
        if(hexStr == null || "".equals(hexStr)){
            return "";
        }
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes);
    }
    public static String hexStringToString(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        s = s.replace(" ", "");
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baKeyword, "UTF-8");
            new String();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return s;
    }
}