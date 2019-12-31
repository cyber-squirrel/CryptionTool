package All_Tool_List.ToolView;

import javax.swing.tree.DefaultMutableTreeNode;

public class NodeAdd {
    //创建根节点
    public DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");

    //创建二级节点
    private DefaultMutableTreeNode index = new DefaultMutableTreeNode("主页");
    private DefaultMutableTreeNode tools = new DefaultMutableTreeNode("工具");
    private DefaultMutableTreeNode code = new DefaultMutableTreeNode("加密");

    //tools下的三级节点
    private DefaultMutableTreeNode Mail = new DefaultMutableTreeNode("邮箱");

    //邮箱下的节点
    private DefaultMutableTreeNode MailOnceCheck = new DefaultMutableTreeNode("Disposable Email Check");

    //code下的三级节点
    private DefaultMutableTreeNode cs = new DefaultMutableTreeNode("现代");
    private DefaultMutableTreeNode cs1 = new DefaultMutableTreeNode("古典");
    private DefaultMutableTreeNode cs2 = new DefaultMutableTreeNode("编码");

    //现代下的节点
    private DefaultMutableTreeNode MD5 = new DefaultMutableTreeNode("Hash");
    private DefaultMutableTreeNode AES = new DefaultMutableTreeNode("AES");

    //古典下的节点
    private DefaultMutableTreeNode ROT13 = new DefaultMutableTreeNode("ROT13");
    private DefaultMutableTreeNode Rail_fence = new DefaultMutableTreeNode("Rail fence(栅栏密码)");
    private DefaultMutableTreeNode Atbash = new DefaultMutableTreeNode("Atbash(埃特巴什码)");
    private DefaultMutableTreeNode Simple_Substitution = new DefaultMutableTreeNode("Simple Substitution(简单替换)");
    private DefaultMutableTreeNode Hill = new DefaultMutableTreeNode("Hill(希尔密码)");
    private DefaultMutableTreeNode Polybius_Square = new DefaultMutableTreeNode("Polybius Square(波利比奥斯方阵)");
    private DefaultMutableTreeNode Playfair = new DefaultMutableTreeNode("Playfair(普莱菲尔密码)");
    private DefaultMutableTreeNode Vigenere = new DefaultMutableTreeNode("Vigenere(维吉尼亚密码)");
    private DefaultMutableTreeNode Autokey = new DefaultMutableTreeNode("Autokey(自动密钥密码)");
    private DefaultMutableTreeNode Beaufort = new DefaultMutableTreeNode("Beaufort(博福特密码)");
    private DefaultMutableTreeNode Running_Key = new DefaultMutableTreeNode("Running Key(滚动密钥密码)");
    private DefaultMutableTreeNode Porta = new DefaultMutableTreeNode("Porta(Porta 密码)");
    private DefaultMutableTreeNode Affine = new DefaultMutableTreeNode("Affine(仿射密码)");
    private DefaultMutableTreeNode Baconian = new DefaultMutableTreeNode("Baconian(培根密码)");
    private DefaultMutableTreeNode ADFGX = new DefaultMutableTreeNode("ADFGX(ADFGX 密码)");
    private DefaultMutableTreeNode ADFGVX = new DefaultMutableTreeNode("ADFGVX(ADFGVX 密码)");
    private DefaultMutableTreeNode Bifid = new DefaultMutableTreeNode("Bifid(双密码)");
    private DefaultMutableTreeNode Four_Square = new DefaultMutableTreeNode("Porta(Porta 密码)");
    private DefaultMutableTreeNode Straddle_Checkerboard = new DefaultMutableTreeNode("Straddle Checkerboard(跨棋盘)");

    //编码下的节点
    private DefaultMutableTreeNode URL = new DefaultMutableTreeNode("URL");
    private DefaultMutableTreeNode Base64 = new DefaultMutableTreeNode("Base64");
    private DefaultMutableTreeNode Morse_Code = new DefaultMutableTreeNode("Morse Code");
    private DefaultMutableTreeNode ASCII = new DefaultMutableTreeNode("ASCII");
    private DefaultMutableTreeNode HEX = new DefaultMutableTreeNode("HEX");
    private DefaultMutableTreeNode Unicode = new DefaultMutableTreeNode("Unicode");
    private DefaultMutableTreeNode Tap_Code = new DefaultMutableTreeNode("Tap Code");
    private DefaultMutableTreeNode Shell_Code = new DefaultMutableTreeNode("Shell Code");
    private DefaultMutableTreeNode Uuencode = new DefaultMutableTreeNode("Uuencode");
    private DefaultMutableTreeNode Xxencode = new DefaultMutableTreeNode("Xxencode");
    private DefaultMutableTreeNode Conversion = new DefaultMutableTreeNode("Base Conversion");

    void setnode(){
        //--------

        //往根节点添加二级节点
        root.add(index);
        root.add(tools);
        root.add(code);

        //--------
        tools.add(Mail);

        ///-------
        Mail.add(MailOnceCheck);

        //--------

        //往code下添加节点
        code.add(cs);
        code.add(cs1);
        code.add(cs2);
        //--------

        //往现代节点下添加节点
        cs.add(AES);
        cs.add(MD5);

        //--------

        //往古典节点下添加节点
        cs1.add(Atbash);
        cs1.add(ROT13);
        cs1.add(Rail_fence);
        //cs1.add(Simple_Substitution);
        //cs1.add(Hill);
        //cs1.add(Polybius_Square);
        //cs1.add(Playfair);
        //cs1.add(Vigenère);
        //cs1.add(Autokey);
        //cs1.add(Beaufort);
        //cs1.add(Running_Key);
        //cs1.add(Porta);
        //cs1.add(Affine);
        //cs1.add(Baconian);
        //cs1.add(ADFGX);
        //cs1.add(ADFGVX);
        //cs1.add(Bifid);
        //cs1.add(Four_Square);
        //cs1.add(Straddle_Checkerboard);


        //--------

        //往编码节点下添加节点
        cs2.add(ASCII);
        cs2.add(Base64);
        cs2.add(Conversion);
        cs2.add(HEX);
        cs2.add(Morse_Code);
        cs2.add(URL);
        cs2.add(Unicode);
        //cs2.add(Tap_Code);
        //cs2.add(Shell_Code);
        //cs2.add(Uuencode);
        //cs2.add(Xxencode);
    }
}