package com.grade.project.grade.util.wx;

public class WxConfigUtils {

    /**
     * 微信普通用户认证地址
     */
    public final static String WX_USER_AUTH = "http://192.168.10.167:3000/#/wechatBind";

    public final static String WX_APPID = "wxba2ae291ef2cbda7";

    public final static String WX_TOKEN = "10086";
    public final static String MCH_IDH5 = "1455666502";
    /**
     * 微信总代理用户认证地址
     */
    public final static String WX_BOSS_USER_AUTH = "http://192.168.10.167:3000/#/makeMoney/checkStore";


    /**
     * oauth2授权接口(GET)
     * 参数：APPID、REDIRECT_URL
     */
    public final static String OAUTH2_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URL&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect";

    /**
     * 获取access_token和openID
     * 参数：APPID、APPSECRET、CODE
     */
    public final static String GET_WX_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=APPSECRET&code=CODE&grant_type=authorization_code";

    /**
     * 获取微信授权的详细用户信息
     * 参数：ACCESSTOKEN、OPENID
     */
    public final static String GET_WX_USERINFO = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESSTOKEN&openid=OPENID&lang=zh_CN";

    /**
     * 企业付款
     * 商户转账URL
     */
    public final static String TRANSFERS_PAY = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";

    /**
     * 总代理的分支下的分成比例
     */
    public final static Integer GENERAL_AGENT_RUN = 5;
}
