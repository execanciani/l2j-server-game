/*
 * Copyright © 2004-2024 L2J Server
 *
 * This file is part of L2J Server.
 *
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.gameserver.config;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.aeonbits.owner.Config.HotReloadType.ASYNC;
import static org.aeonbits.owner.Config.LoadType.MERGE;

import org.aeonbits.owner.Config.HotReload;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Reloadable;

/**
 * Seven Signs Configuration.
 * @author Zoey76
 * @version 2.6.1.0
 */
@Sources({
	"file:${L2J_HOME}/custom/game/config/sevensigns.properties",
	"file:./config/sevensigns.properties",
	"classpath:config/sevensigns.properties"
})
@LoadPolicy(MERGE)
@HotReload(value = 20, unit = MINUTES, type = ASYNC)
public interface SevenSignsConfiguration extends Reloadable {
	
	@Key("RequireClanCastle")
	Boolean requireClanCastle();
	
	@Key("CastleForDawn")
	Boolean castleForDawn();
	
	@Key("CastleForDusk")
	Boolean castleForDusk();
	
	@Key("FestivalMinPlayer")
	Integer getFestivalMinPlayer();
	
	@Key("MaxPlayerContrib")
	Integer getMaxPlayerContrib();
	
	@Key("FestivalManagerStart")
	Integer getFestivalManagerStart();
	
	@Key("FestivalLength")
	Integer getFestivalLength();
	
	@Key("FestivalCycleLength")
	Integer getFestivalCycleLength();
	
	@Key("FestivalFirstSpawn")
	Integer getFestivalFirstSpawn();
	
	@Key("FestivalFirstSwarm")
	Integer getFestivalFirstSwarm();
	
	@Key("FestivalSecondSpawn")
	Integer getFestivalSecondSpawn();
	
	@Key("FestivalSecondSwarm")
	Integer getFestivalSecondSwarm();
	
	@Key("FestivalChestSpawn")
	Integer getFestivalChestSpawn();
	
	@Key("DawnGatesPdefMult")
	Double getDawnGatesPdefMult();
	
	@Key("DuskGatesPdefMult")
	Double getDuskGatesPdefMult();
	
	@Key("DawnGatesMdefMult")
	Double getDawnGatesMdefMult();
	
	@Key("DuskGatesMdefMult")
	Double getDuskGatesMdefMult();
	
	@Key("StrictSevenSigns")
	Boolean strictSevenSigns();
	
	@Key("SevenSignsLazyUpdate")
	Boolean sevenSignsLazyUpdate();
	
	@Key("SevenSignsDawnTicketQuantity")
	Integer getSevenSignsDawnTicketQuantity();
	
	@Key("SevenSignsDawnTicketPrice")
	Integer getSevenSignsDawnTicketPrice();
	
	@Key("SevenSignsDawnTicketBundle")
	Integer getSevenSignsDawnTicketBundle();
	
	@Key("SevenSignsManorsAgreementId")
	Integer getSevenSignsManorsAgreementId();
	
	@Key("SevenSignsJoinDawnFee")
	Integer getSevenSignsJoinDawnFee();
}