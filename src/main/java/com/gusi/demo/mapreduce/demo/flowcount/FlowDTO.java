package com.gusi.demo.mapreduce.demo.flowcount;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * FlowDTO <br>
 *
 * @author yydeng
 * @since 2020/6/11
 */
public class FlowDTO implements Writable {

	private int upPkgs;
	private int downPkgs;
	private long upFlows;
	private long downFlows;

	public FlowDTO() {
	}

	public FlowDTO(int upPkgs, int downPkgs, long upFlows, long downFlows) {
		this.upPkgs = upPkgs;
		this.downPkgs = downPkgs;
		this.upFlows = upFlows;
		this.downFlows = downFlows;
	}

	@Override
	public void write(DataOutput dataOutput) throws IOException {
		dataOutput.writeInt(upPkgs);
		dataOutput.writeInt(downPkgs);
		dataOutput.writeLong(upFlows);
		dataOutput.writeLong(downFlows);
	}

	@Override
	public void readFields(DataInput dataInput) throws IOException {
		this.upPkgs = dataInput.readInt();
		this.downPkgs = dataInput.readInt();
		this.upFlows = dataInput.readLong();
		this.downFlows = dataInput.readLong();
	}

	public int getUpPkgs() {
		return upPkgs;
	}

	public void setUpPkgs(int upPkgs) {
		this.upPkgs = upPkgs;
	}

	public int getDownPkgs() {
		return downPkgs;
	}

	public void setDownPkgs(int downPkgs) {
		this.downPkgs = downPkgs;
	}

	public long getUpFlows() {
		return upFlows;
	}

	public void setUpFlows(long upFlows) {
		this.upFlows = upFlows;
	}

	public long getDownFlows() {
		return downFlows;
	}

	public void setDownFlows(long downFlows) {
		this.downFlows = downFlows;
	}

	@Override
	public String toString() {
		return upPkgs + "," + downPkgs + "," + upFlows + "," + downFlows;
	}
}
