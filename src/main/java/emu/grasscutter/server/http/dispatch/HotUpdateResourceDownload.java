package emu.grasscutter.server.http.dispatch;

public class HotUpdateResourceDownload {
  public static class Resource {
    public String resourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/4.6_live";
    
    public String dataUrl = "https://autopatchcn.yuanshen.com/client_design_data/4.6_live";
    
    public String resourceUrlBak = "4.6_live";
    
    public int clientDataVersion = 22626513;
    
    public int clientSilenceDataVersion = 22543584;
    
    public String clientDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"47d16e08481d5c9e053bfdce91fdc1dd\", \"hash\": \"98f9c5ce94492891\", \"fileSize\": 6523}\r\n{\"remoteName\": \"data_versions_medium\", \"md5\": \"f3327c0818d882a369a2c3b235a0d439\", \"hash\": \"c8861c54127ea66e\", \"fileSize\": 6523}";
    
    public String clientSilenceDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"0ffe0d2b29a954c5a0f50f12fd3f3d6c\", \"hash\": \"3386c2e6b3076e11\", \"fileSize\": 522}";
    
    public HotUpdateResourceDownload.ResVersionConfig resVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
    
    public String clientVersionSuffix = "d47876295c";
    
    public String clientSilenceVersionSuffix = "8ea3d42e6b";
    
    public String nextResourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/4.6_live";
    
    public HotUpdateResourceDownload.ResVersionConfig nextResVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
  }
  
  public static class ResVersionConfig {
    public int version = 22608561;
    
    public String md5 = "{\"remoteName\": \"base_revision\", \"md5\": \"630eb4a021be598c8182b17f71b5eda6\", \"fileSize\": 19}";
    
    public String releaseTotalSize = "0";
    
    public String versionSuffix = "fcbb017dbc";
    
    public String branch = "4.6_live";
  }
}
