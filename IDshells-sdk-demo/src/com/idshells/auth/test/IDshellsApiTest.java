package com.idshells.auth.test;

import com.idshells.auth.IDshellsApi;
import com.idshells.auth.util.JsonHelper;
import com.idshells.auth.util.SDKObject;

/**
 * 
 * 类、接口等说明
 *
 * @Date 2014年7月25日,下午1:19:48
 * @version v1.0
 * @author
 */
public class IDshellsApiTest {

    private static String authServerAddr = "http://140.143.204.240:1880"; // 应用服务器访问地址
    private static String appKey = "08AA92FD3CC3E11A12DD"; // 应用标识
    private static String appSecret = "CDFF0E48D1090209634C00297489D7ED7C1118F8"; // 应用安全密钥

    //**********************************************以下为用户接口************************************

    /**
     * 判断用户是否存在 
     * @Date 2018年6月10日,下午4:27:02 
     * @author CS 
     * @return void 
     * @throws
     */
    public static void isUserExist(String username) {
        String result = IDshellsApi.isUserExist(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 添加用户 
     * @Date 2018年6月10日,下午4:45:11 
     * @author CS 
     * @return void 
     * @throws
     */
    public static void addUser(String username) {
        String result = IDshellsApi.addUser(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 启用用户 
     * @Date 2018年6月10日,下午4:44:26 
     * @author CS 
     * @return void 
     * @throws
     */
    public static void enableUser(String username) {
        String result = IDshellsApi.enableUser(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 停用用户 
     * @Date 2018年6月10日,下午4:44:44 
     * @author CS 
     * @return void 
     * @throws
     */
    public static void disableUser(String username) {
        String result = IDshellsApi.disableUser(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 锁定用户 
     * @Date 2018年6月10日,下午4:46:45 
     * @author CS 
     * @return void 
     * @throws
     */
    public static void lockUser(String username) {
        String result = IDshellsApi.lockUser(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 解锁用户 
     * @Date 2018年6月10日,下午4:46:52 
     * @author CS 
     * @return void 
     * @throws
     */
    public static void unLockUser(String username) {
        String result = IDshellsApi.unLockUser(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    //**********************************************以下为手机令牌接口************************************

    /**
     *  检查是否已经激活手机令牌
     *  @Date 2018年6月10日,下午5:26:22 
     *  @author CS 
     *  @return void 
     *  @throws
     */
    public static void isMobileTokenActived(String username) {
        String result = IDshellsApi.isMobileTokenActived(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 获取手机令牌激活数据
     * @Date   2018年6月10日,下午5:35:50
     * @author CS
     * @return void
     * @throws
     */
    public static void getMobileTokenActiveData(String username) {
        String result = IDshellsApi.getMobileTokenActiveData(username);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        String activecode = object.getActivecode();
        System.out.println("code:" + code);
        System.out.println("activedata:" + activecode);
    }

    /**
     * OTP认证(goolge-otp和短信otp都使用此接口)
     * @Date   2018年6月10日,下午7:30:18
     * @author CS
     * @return void
     * @throws
     */
    public static void userOTPAuth(String username, String otp) {
        String result = IDshellsApi.userOTPAuth(username, otp);
        System.out.println(result);
        SDKObject object = JsonHelper.getSDKObject(result);
        int code = object.getCode();
        String authtoken = object.getAuthtoken();//获取token
        System.out.println("code:" + code);
        System.out.println("authtoken:" + authtoken);
    }

    //**********************************************以下为短信令牌接口************************************
    /**
     * 发送短信令牌
     * @Date   2018年7月9日,下午3:09:18
     * @author CS
     * @param username
     * @param phoneSN
     * @return void
     * @throws
     */
    public static void sendSmsOtp(String username, String phoneSN) {
        String json = IDshellsApi.sendSmsOtp(username, phoneSN);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);
    }
    
    /**
     * 发送邮件令牌
     * @Date   2018年7月9日,下午3:10:03
     * @author CS
     * @param username
     * @param email
     * @return void
     * @throws
     */
    public static void sendEmailOtp(String username, String email) {
        String json = IDshellsApi.sendEmailOtp(username, email);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    //**********************************************以下为微信认证接口************************************

    /**
     * 查看用户是否开通微信令牌认证(返回code为204表示未开通)
     * @Date   2018年6月10日,下午9:37:49
     * @author CS
     * @param username
     * @return void 
     * @throws
     */
    public static void isWechatTokenActived(String username) {
        String json = IDshellsApi.isWechatTokenActived(username);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 获取微信令牌激活码
     * @Date   2018年6月10日,下午9:46:09
     * @author CS
     * @return void
     * @throws
     */
    public static String getWechatTokenAC(String username) {
        String wechatAC = "";
        String json = IDshellsApi.getWechatTokenAC(username);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);

        if (0 == code) { // 返回码为0表示成功
            wechatAC = object.getWechatac();
            System.out.println("wechatAC:" + wechatAC);
        }

        return wechatAC;
    }

    /**
     * 激活微信令牌
     * @Date   2018年6月10日,下午9:46:28
     * @author CS
     * @param openid
     * @param wechatAC
     * @return void
     * @throws
     */
    public static void activeWechatToken(String openid, String wechatAC) {
        String json = IDshellsApi.activeWechatToken(openid, wechatAC);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 第1步.获取用户微信扫码认证二维码信息(应用服务器调用，调用完成展示二维码后，可立即调用第四步)
     * @Date   2018年6月10日,下午11:50:33
     * @author CS
     * @param username
     * @return void
     * @throws
     */
    public static String getWechatQrcode(String username) {
        String json = IDshellsApi.getQrcode(username);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);

        String qrcodedata = "";
        if (code == 0) {
            qrcodedata = object.getQrcodedata();
        }
        System.out.println("qrcodedata:" + qrcodedata);
        return qrcodedata;
    }

    /**
     * 第2步.获取用户微信扫码认证二维码信息(微信服务器调用)
     * @Date   2018年6月10日,下午11:16:18
     * @author CS
     * @param username
     * @return void
     * @throws
     */
    public static void getWechatScanAuthInfo(String qrcode, String openid) {
        String json = IDshellsApi.getWechatScanAuthInfo(qrcode, openid);
        System.out.println(json);
        SDKObject object = JsonHelper.getSDKObject(json);
        int code = object.getCode();
        System.out.println("code:" + code);
        if (0 == code) { // 返回码为0表示成功
            System.out.println("用户名：" + object.getUserid());
            System.out.println("应用名：" + object.getAppname());
            System.out.println("reqid：" + object.getReqid());
        }
    }

    /**
     * 第3步.微信扫码认证响应 (微信服务器调用)
     * @Date   2018年6月10日,下午11:19:53
     * @author CS
     * @param reqid
     * @param username
     * @param ret 0：拒绝登录  1：确认登录
     * @return void
     * @throws
     */
    public static void wechatScanAuthResponse(String reqid, String username, String ret) {
        String json = IDshellsApi.wechatScanAuthResponse(reqid, username, ret);
        SDKObject object = JsonHelper.getSDKObject(json);
        System.out.println(json);
        int code = object.getCode();
        System.out.println("code:" + code);
    }

    /**
     * 第4步.获取微信扫码认证结果
     * @Date   2018年6月11日,上午12:08:26
     * @author CS
     * @param reqid
     * @return void
     * @throws
     */
    public static void scanAuth(String reqid) {
        String json = IDshellsApi.scanAuth(reqid);
        SDKObject object = JsonHelper.getSDKObject(json);
        System.out.println(json);
        int code = object.getCode();
        String authtoken = object.getAuthtoken();//获取token
        System.out.println("code:" + code);
        System.out.println("authtoken:" + authtoken);
    }

    // ***********************************************************************************************************************

    public static void main(String[] args) {
        IDshellsApi.init(authServerAddr, appKey, appSecret);// 初始化

        String userName = "test-user";

        isUserExist(userName);//返回0表示用户存在且激活了令牌 201表示用户不存在 或 204未激活令牌
        // addUser(userName);
        //enableUser(userName);
        //disableUser(userName);
        //lockUser(userName);
        //unLockUser(userName);

//        isMobileTokenActived(userName);
//        getMobileTokenActiveData(userName);
        //userOTPAuth(userName,"570784");

        sendSmsOtp(userName,"12345678901");
        
        //sendEmailOtp(userName,"XXX@163.com");
        
        //userOTPAuth(userName, "125587");

        //isWechatTokenActived(userName);
        /*
        String wechatAC = getWechatTokenAC(userName);
        activeWechatToken(userName+"-openid", wechatAC);
        */
        /*
        String qrcodedata= getWechatQrcode(userName);
        getWechatScanAuthInfo(qrcodedata,userName+"-openid");
        wechatScanAuthResponse(qrcodedata,userName,"1");
        scanAuth(qrcodedata);
        */
    }
}