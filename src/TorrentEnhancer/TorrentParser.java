/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TorrentEnhancer;

import jBittorrentAPI.DownloadManager;
import jBittorrentAPI.TorrentFile;
import jBittorrentAPI.TorrentProcessor;
import java.io.File;

/**
 *
 * @author Usurper
 */
public class TorrentParser {
    
        private DownloadManager dm;
    private TorrentProcessor tp;
    private TorrentFile torrentfile;
    private File file;
    
                  
            
    public TorrentParser(File file) {
           this.file = file;
    }
  
    public Void Parse() {
            
        tp = new TorrentProcessor();
        torrentfile = tp.getTorrentFile(tp.parseTorrent(file));
        System.out.println(torrentfile.name);
        System.out.println(torrentfile.info_hash_as_hex);
        return(null);
    }
}
