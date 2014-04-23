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
import java.util.*;

/**
 *
 * @author Usurper
 */
public class TorrentParser {
    

    private TorrentProcessor tp;
    public TorrentFile torrentfile;
    private File file;
    
    public String TorrentHash;
    public String TorrentName;
    public ArrayList TorrentFiles;
    public java.util.Map parse;    
    public TorrentParser(File file) {
        
           this.file = file;
    }
  
    public Void Parse() {
           
        tp = new TorrentProcessor();
        torrentfile = tp.getTorrentFile(tp.parseTorrent(file));
       // System.out.println(torrentfile.name);
        TorrentHash = torrentfile.info_hash_as_hex;
        TorrentName = torrentfile.saveAs;
        TorrentFiles = torrentfile.name;
  
        return(null);
    }
    
    
    
}

