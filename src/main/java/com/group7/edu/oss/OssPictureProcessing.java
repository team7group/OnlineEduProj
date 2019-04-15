package com.group7.edu.oss;

import org.springframework.stereotype.Component;

/**
 * @author 993926972
 */
@Component
public class OssPictureProcessing implements OssPicture {
    @Override
    public  String  pctureArbitrarySize(String fileUuid, int w, int h) {

        return "http://wojiaotanqinglin.oss-cn-beijing.aliyuncs.com/2ff8858e4b0945fbb4962d63305f7b22timg%20%289%29.jpg?Expires=2021380732&OSSAccessKeyId=LTAIL1qngeuPQ1Vw&Signature=QR8CSapPRAg7Rb0Ko6Sb7T6%2BmFk%3D&x-oss-process=image%2Fresize%2Cm_fixed%2Cw_600%2Ch_600";
    }
    @Override
    public  String  compressionfixation(String fileUuid){
        return "http://wojiaotanqinglin.oss-cn-beijing.aliyuncs.com/5bde22cb6897491bbdd2b6e6696d3c40timg%20%283%29.jpg?Expires=2021380647&OSSAccessKeyId=LTAIL1qngeuPQ1Vw&Signature=S7jXG59sCygjvwZfPYknbW2XkEM%3D&x-oss-process=image%2Fresize%2Cm_fixed%2Cw_156%2Ch_156\n";
    }
    @Override
    public  String  originalGraph(String fileUuid) {

        return "http://wojiaotanqinglin.oss-cn-beijing.aliyuncs.com/770fc8596b28435084ed4a6fa6bb380ftimg%20%285%29.jpg?Expires=2021380683&OSSAccessKeyId=LTAIL1qngeuPQ1Vw&Signature=uEM2B%2FAlEWB51AWdcByxUdtBoaw%3D&x-oss-process=image%2Fresize%2Cm_fixed%2Cw_4000%2Ch_4000\n";
    }
}
